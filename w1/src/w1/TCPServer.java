package w1;

import java.net.*;
import java.io.*;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ssc = new ServerSocket(4600);
			Socket sc = ssc.accept();
			String s = "";
			BufferedReader bf = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())),true);
			while((s=bf.readLine())!=null) {
				print("服务端收到："+s);
				pw.println(s);
			}
			bf.close();
			pw.close();
			sc.close();
			ssc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
