package w1;
import java.net.*;
public class T1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.javasoft.com/java/index.html");
			print("对象字符串"+url.toString());
			print("对象文件"+url.getFile());
			print("对象端口"+url.getPort());
			print("对象协议"+url.getProtocol());
			print("对象主机"+url.getHost());
			
			print(InetAddress.getAllByName("localhost").toString());
			
		}catch(MalformedURLException e) {
			print("输入错误的URL");
		}

	}
	public static void print(String s) {
		System.out.println(s);
	}

}
