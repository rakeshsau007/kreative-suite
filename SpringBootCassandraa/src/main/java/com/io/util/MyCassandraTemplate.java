package com.io.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.io.entity.Employee;

@Repository
public class MyCassandraTemplate {

	
	@Autowired
    private CassandraOperations cassandraTemplate;
    
    /** MyCassandraTemplate Default constructor*/
    public MyCassandraTemplate() {
        System.out.println("MyCassandraTemplate()");
    }
    
    
    public <T> T create(T entity) {
        return cassandraTemplate.insert(entity);
    }

    public <T> T update(T entity) {     
        return (T) cassandraTemplate.update(entity);
    }
    
    public <T> T findById(Object id, Class<T> claz) {
        return cassandraTemplate.selectOneById(claz, id);
    }
    
    public <T> void deleteById(Object id, Class<T> claz) {
        cassandraTemplate.deleteById(claz, id);
    }
    
    public void delete(Object entity) {
        cassandraTemplate.delete(entity);
    }

}
