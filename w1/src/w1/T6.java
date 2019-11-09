package w1;


import java.net.InetAddress;
import java.net.UnknownHostException;
public class T6 {
     public static void main(String []args) 
                                     throws UnknownHostException {
	InetAddress ad=InetAddress.getByName("localhost");
	System.out.println("主机名："+ad.getHostName());
	System.out.println("主机地址：   "+ad.getHostAddress());
	System.out.println(ad.getCanonicalHostName());
	System.out.println("本地地址：   "+ad.getAddress());
	System.out.println("本地主机名：   "+ad.getLocalHost());	}
}
