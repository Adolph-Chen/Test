package w1;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client {

	public static Socket sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadin i = new Threadin();
	    Threadout o = new Threadout();
	    
		try {//103.46.128.49  InetAddress.getByName("2i481o2833.wicp.vip")   utool.club
			
			sc = new Socket(InetAddress.getByName("utools.club"),44025);
			//print("hhhh");
			try {
				i.start();
				o.start();

			}catch(Exception e) {
				print(e.toString());
			}
		}catch(IOException e) {
			print(e.toString());
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
					if((str)=="bye") {
						bf.close();
						sc.close();
						break;
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
