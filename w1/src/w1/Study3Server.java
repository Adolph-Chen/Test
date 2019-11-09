package w1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class Study3Server extends Thread{
	public static int num=0;
	private int num1=0;
	public String s;
    private static ServerSocket socket = null;
    public Study3Server() {
    	super();
    	if(socket == null) {
    		try {
        		socket = new ServerSocket(4600);
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
			num1 = num;
			print(num1+" link "+"succed");
			
			try {
				
				Study3Server study3Server = new Study3Server();
				
				study3Server.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			InputStreamReader ir = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			OutputStreamWriter ow = new OutputStreamWriter(sc.getOutputStream());
			//BufferedWriter bw = new BufferedWriter(ow);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())),true);
			
			
			while(!(s=br.readLine()).equals("bye")&&s!=null){
				if(s.equals("byebye")) {
					br.close();
					pw.close();
					sc.close();
					
					System.exit(-1);
				}
				print("Á¬½Ó"+num1+": "+s);
				pw.println(s);
			}
			br.close();
			pw.close();
			sc.close();
			
			
			

		}catch(Exception e) {
			try {
				new Thread().sleep(10);
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		
		}finally {
			
			try {
				
				Study3Server study3Server = new Study3Server();
				
				study3Server.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		
		
		
	}

}
