package w1;
import java.net.*;

public class UDPServer {
	//public static ServerSocket soc;

	public static InetAddress remoteIP =  null;
	public static int port;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket dsc = new DatagramSocket(4700);
			byte[] buf = new byte[256];
			byte[] buf1 = new byte[256];
			DatagramPacket packet = new DatagramPacket(buf,buf.length);
			
			dsc.receive(packet);
			remoteIP = packet.getAddress();
			port  = packet.getPort();
			buf1 = packet.getData();
			String str = new String(buf1,0,buf1.length);
			while(str!=null) {
				print("服务端收到："+str.charAt(0));
				SocketAddress socketAddress=new InetSocketAddress(remoteIP,port);
				byte[] outputData=str.getBytes();
                DatagramPacket outputPacket=new DatagramPacket(outputData,outputData.length,socketAddress);
                dsc.send(outputPacket);
                if(str.charAt(0)=='Z') {
                	System.exit(-1);
                }
				dsc.receive(packet);
				buf1 = packet.getData();
				str = new String(buf1,0,buf1.length);
				
			}
			
			
			dsc.close();
           
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	   
	 		
	}
		
	
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	
}


