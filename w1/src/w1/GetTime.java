package w1;
import java.net.*;
import java.io.*;
public class GetTime {
	//time.nist.gov
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket sc = new Socket(InetAddress.getByName("localhost"),4700);
			//Socket sc = new Socket(InetAddress.getByName("time.nist.gov"),13);
			InputStreamReader ir = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			String s;
			while((s=br.readLine())!=null) {
				if(s.length()>1){
				
			
					String[] ss = s.split(" ");
					if(ss.length>1) {
						//print(ss[1]+" "+ss[2]);
						String[] sss = ss[2].split(":");
						int h = Integer.parseInt(sss[0]);
						h = h+8;
						sss[0] = String.valueOf(h);
						
						print(ss[1]+" "+sss[0]+":"+sss[1]+":"+sss[2]);
					}else {
						print(ss[0]);
					}
				
					
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static void print(String s) {
		System.out.println(s);
	}

}
