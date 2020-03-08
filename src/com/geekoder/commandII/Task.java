package com.geekoder.commandII;

public class Task {

	private int id;
	
	public Task(int id) {
		this.id = id ;
	}
	
	public void solveProblem(){
		System.out.println("Solving the problem with Id " + id);
	}
}
