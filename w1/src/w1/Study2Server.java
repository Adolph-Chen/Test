package w1;

import java.util.Calendar;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.*;
public class Study2Server extends Thread{
	public static int num=0;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int s;
    private static  ServerSocket socket = null;
    public Study2Server() {
    	super();
    	if(socket==null) {
    		try {
        		socket = new ServerSocket(4700);
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    	}
    	
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Study2Server study2Server = new Study2Server();
//		Thread thread=new Thread(study2Server,num+"");
//		thread.start();
//
//	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public void run() {
		
		try {
			
			
			Socket sc = socket.accept();
			num++;
			print(num+"succed");
			
			OutputStreamWriter ow = new OutputStreamWriter(sc.getOutputStream());
			BufferedWriter bw = new BufferedWriter(ow);
			
			Calendar calendar = Calendar.getInstance();
			year = calendar.get(Calendar.YEAR);
			month = calendar.get(Calendar.MONTH)+1;
			day = calendar.get(Calendar.DAY_OF_MONTH);
			hour = calendar.get(Calendar.HOUR);
			minute = calendar.get(Calendar.MINUTE);
			s = calendar.get(Calendar.SECOND);
			
			String ss = year+":"+month+":"+day+":"+hour+":"+minute+":"+s;
			bw.write(ss);
			
			bw.close();
			sc.close();
			
			
			

		}catch(Exception e) {
			try {
				new Thread().sleep(10);
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		
		}finally {
			try {
				
				Study2Server study2Server = new Study2Server();
				
				study2Server.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		
		
		
	}

}
