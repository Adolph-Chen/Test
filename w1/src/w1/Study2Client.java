package w1;
import java.io.*;
import java.net.*;
public class Study2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket sc = new Socket(InetAddress.getByName("localhost"),4700);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			print(br.readLine());
			//String s;
			//while((s=br.readLine())!=null){
			//	print(s+"");
			//}
			
			br.close();
			sc.close();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		

	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
