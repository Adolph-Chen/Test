package w1;
import java.io.*;
import java.net.*;
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			ServerSocket ss = new ServerSocket(51144);
			Socket s = ss.accept();
			BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str;
			while((str = bf.readLine())!=null) {
				print(str);
			}
			ss.close();
			
		}catch(IOException e) {
			print(e.toString());
		}

	}
	public static void print(String s) {
		System.out.println(s);
	}


}
