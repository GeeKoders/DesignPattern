package com.geekoder.singleton;

public class App {
	
	/*
	 *  Singleton pattern -> restricts the instantiation of a class to one object
	 *  	This is useful when exactly one object is need to coordinate actions across the system
	 * 
	 * 				~ for example: we need just single database instance !!!
	 */
	
	public static void main(String[] args) {
		Downloader d = Downloader.getInstance();
		d.startDownloading();
		
		Downloader d2 = Downloader.getInstance();
		d2.startDownloading();
		
		if( d==d2){
			System.out.println("They are the same...");
		}
	}

}
