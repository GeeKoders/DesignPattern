package com.geekoder.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;


// invoker
public class Switcher {

	public List<Command> commands ;
	
	public Switcher() {
		this.commands = new ArrayList<>() ;
	}
	
	public void addCommand(Command command){
		this.commands.add(command) ;
	}
	
	public void executeCommand(){
		for(Command command: commands){
			command.execute();
		}
	}
	
	
}
