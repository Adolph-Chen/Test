package w1;

import java.io.*;
import java.net.*;
public class A1 {
	public static void main(String[] args) {
		String hostName;
			//"www.time.ac.cn" »ò "time.nist.gov"
			hostName = "time.nist.gov";
		try{
			Socket socket = new Socket(InetAddress.getByName(hostName),13);
			InputStream is =socket.getInputStream();
			StringBuffer time = new StringBuffer();
			int iCharacter;
			while((iCharacter = is.read()) != -1){
				time.append((char)iCharacter);
			}
			// Convert Daytime to a String and output.
			String sTime = time.toString().trim();
			System.out.println(sTime);
			is.close();
			socket.close();
			 
		}catch (UnknownHostException e){
			System.err.print(e);
		}catch (IOException e){
			System.err.print(e);
		}
	}
}
