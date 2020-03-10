package com.geekoder.singleton;

public class Downloader {

	// eager version
	private static Downloader downloader;
	
	private Downloader(){
		
	}
	
	public void startDownloading(){
		System.out.println("Start downloading data from the web...");
	}
	
	// lazy version
	public static Downloader getInstance(){
		
		if(downloader == null){
			downloader = new Downloader() ;
		}
		return Downloader.downloader ;
	}
}
