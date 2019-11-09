package w1;
import java.io.*;
import java.net.*;
public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL google = new URL("http://2i481o2833.wicp.vip:80");
			BufferedReader bf = new BufferedReader(new InputStreamReader(google.openStream()));
			String s;
			while(( s = bf.readLine())!=null) {
				print(s);
			}
			bf.close();
		}
		catch(MalformedURLException e) {
			print("1");
		}
		catch(IOException e) {
			print("2");
		}
	}
	public static void print(String s) {
		System.out.println(s);
	}


}
