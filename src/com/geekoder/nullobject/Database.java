package com.geekoder.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<String> customerNames; 
	
	public Database() {
		this.customerNames = new ArrayList<>() ;
		
		this.customerNames.add("Danel") ;
		this.customerNames.add("Adam") ;
		this.customerNames.add("Joe") ;
		this.customerNames.add("Michael") ;
		
	}
	
	public boolean existCustomer(String name){
		
		for(String s: customerNames){
			if( s.equals(name)){
				return true ;
			}
		}
		return false ;
		
	}

}
