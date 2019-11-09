package w1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.util.Calendar;

public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://time.is/Beijing
		//BufferedReader bf = null;
		//Socket socket = null;
		//Socket socket = null;
		//String host = "https://time.is";
		String host = "https://www.pku.edu.cn";
		//String host = "http://www.baidu.com"
		//String host = "time.is";
		//String host = "http://www.bjtime.cn";
		
		
		
		try {
			
			URL url = new URL(host);// 取得资源对象
			URLConnection uc = url.openConnection();// 生成连接对象
			uc.connect(); // 发出连接
			long id = uc.getDate();
			Date date = new Date(id); // 转换为标准时间对象
			//print(id+"");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH)+1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int hour = calendar.get(Calendar.HOUR);
			int minute = calendar.get(Calendar.MINUTE);
			int s = calendar.get(Calendar.SECOND);
			print(year+":"+month+":"+day+":"+hour+":"+minute+":"+s);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
