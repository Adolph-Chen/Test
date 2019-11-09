package w1;
import java.net.*;
public class T4 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ad = InetAddress.getByName("2i481o2833.wicp.vip");
		print("zhujidizhi "+ad.getHostAddress());
		print("zhujiming "+ad.getHostName());
		print("bendi dizhi "+ad.getAddress());
		print("bendi ming "+ad.getLocalHost());

	}
	public static void print(String s) {
		System.out.println(s);
	}


}
