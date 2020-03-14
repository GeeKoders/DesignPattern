package com.geekoder.dao;

public class App {

	public static void main(String[] args) {
		
		Database database = new Database();

		Person adam = new Person("Adam", 47) ;
		
		
		database.insert(new Person("John", 27));
		database.insert(adam);
		database.insert(new Person("Joe", 37));

		for (Person person : database.getPeople()) {
			System.out.println(person);
		}
		
		database.remove(adam);
		System.out.println();
		
		for (Person person : database.getPeople()) {
			System.out.println(person);
		}
	}

}
