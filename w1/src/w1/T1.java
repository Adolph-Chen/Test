package w1;
import java.net.*;
public class T1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.javasoft.com/java/index.html");
			print("�����ַ���"+url.toString());
			print("�����ļ�"+url.getFile());
			print("����˿�"+url.getPort());
			print("����Э��"+url.getProtocol());
			print("��������"+url.getHost());
			
			print(InetAddress.getAllByName("localhost").toString());
			
		}catch(MalformedURLException e) {
			print("��������URL");
		}

	}
	public static void print(String s) {
		System.out.println(s);
	}

}
