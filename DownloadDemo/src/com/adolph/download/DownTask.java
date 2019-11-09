package com.adolph.download;


import java.util.concurrent.*;
public class DownTask {
	
	
	static int i=0;
	public static ExecutorService excute;
	
	public static void create() {
		excute = Executors.newFixedThreadPool(8);
	}
	public static void play() {
		
		for(String str:Change.list) {
			
			try {	
				Future future = excute.submit(new Task("http://"+str,"E:\\image\\"+Change.name.get(i)));
				future.get();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				i++;
			}
			
	    }
		pause();
		print("*************");
        print("œ¬‘ÿΩ· ¯£°£°£°£°£°£°");
        print("*************");
	}
	public static void pause() {
		try {
			excute.shutdown();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void print(String s) {
    	System.out.println(s);
    }
	
	

}
