package com.io.entity;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;


@Table("itemdetails")
public class Items {
	
	//@PartitionKey
	@Column("itemtype")
	private ArrayList<String> Itemtype;
	
	
	//@PartitionKey(0)
	private String typeID;

	
	//@PartitionKey(1)
	private UUID productName;
	
	public String getTypeID() {
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}

	public ArrayList<String> getItemtype() {
		return Itemtype;
	}

	public void setItemtype(ArrayList<String> itemtype) {
		Itemtype = itemtype;
	}

}
