package w1;


import java.net.InetAddress;
import java.net.UnknownHostException;
public class T6 {
     public static void main(String []args) 
                                     throws UnknownHostException {
	InetAddress ad=InetAddress.getByName("localhost");
	System.out.println("��������"+ad.getHostName());
	System.out.println("������ַ��   "+ad.getHostAddress());
	System.out.println(ad.getCanonicalHostName());
	System.out.println("���ص�ַ��   "+ad.getAddress());
	System.out.println("������������   "+ad.getLocalHost());	}
}
