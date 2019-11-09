package w1;

import java.net.*;

import java.io.*;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Socket sc = new Socket(InetAddress.getByName("localhost"),4600);
			char s;
			String str;
			BufferedReader bf = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())),true);
			for(int i=0;i<26;i++) {
				s = (char) ('A'+i);
				print("客户端发送: "+s);
				pw.println(s);
				
			
				if((str=bf.readLine())!=null) {
					
					print("客户端收到："+str.charAt(0));
				
				}
			}

			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
