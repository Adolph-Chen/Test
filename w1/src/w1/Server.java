package w1;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Server {
	public static ServerSocket soc;
	public static Socket sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadin i = new Threadin();
	    Threadout o = new Threadout();
	   
		try {
			
			soc = new ServerSocket(4900);
			try {
				
				sc = soc.accept();
				print("success");
				i.start();
				o.start();

			}catch(Exception e) {
				print(e.toString());
			}
		}catch(IOException e) {
			print("already use");
		}
		
	
	}
	public static void print(String s) {
		System.out.println(s);
	}
	
	static class Threadin extends Thread{
		public void run() {
			try {
				BufferedReader bf = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				while(true) {
					String str=bf.readLine();
					if((str).equals("bye")) {
						bf.close();
						sc.close();
						soc.close();
						System.exit(-1);;
					}else {
						print(str);
					}
				}
			}catch(IOException e) {
				print(e.toString());
			}
		}
	}
	static class Threadout extends Thread{
		public void run() {
			try {
				Scanner bt = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())),true);
				pw.println("hello");
			    
				
				while(true) {
						pw.println(bt.nextLine());
				}
				
			}catch(IOException e) {
				print(e.toString());
			}finally {
			
			}
		}
	}
}
