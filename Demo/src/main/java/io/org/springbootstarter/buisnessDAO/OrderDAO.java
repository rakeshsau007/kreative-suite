package io.org.springbootstarter.buisnessDAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import io.org.springbootstarter.buisness.Order;
import io.org.springbootstarter.buisness.Order_bk;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {

	
	
		 
		

}
