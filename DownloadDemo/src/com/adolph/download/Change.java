package com.adolph.download;

import java.util.HashSet;
import java.util.regex.*;
import java.util.*;
public class Change {
	public static HashSet<String> Set = new HashSet<String>();
	public static HashSet<String> Set1 = new HashSet<String>();
	public static List<String> list = new ArrayList<String>();
	public static List<String> name = new ArrayList<String>();
	public Change() {
		
	}
	public static void change() {
		//分离用“
		Pattern pattern = Pattern.compile("//\\S*\\.(?:png|jpe?g|gif)");
		for(String str:GetImage.Set) {
			String[] ss = str.split("\"");
			for(String sss:ss) {
				Matcher m = pattern.matcher(sss);
				if(m.find()) {
					Set.add(m.group(0));
				}
			}
			
		}
		
		//分离用//
		Pattern pattern2 = Pattern.compile(".*\\.(?:png|jpe?g|gif)");
		for(String str:Set) {
			String[] ss = str.split("//");
		
			for(String sss:ss) {
				
				Matcher m = pattern2.matcher(sss);
				if(m.find()) {
				   
					Set1.add(m.group(0));
				}
			}
		}
		for(String str:Set1) {
	    	list.add(str);
	    	String[] ss = str.split("/");
	    	name.add(ss[ss.length-1]);
	    }
//		int i=0;
//		for(String str:list) {
//			print(str);
//			print(name.get(i));
//			i++;
//		}
		
		
	}
	
	
	
	public static void print(String s) {
    	System.out.println(s);
    }


}
