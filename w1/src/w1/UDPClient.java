package w1;
import java.net.*;



public class UDPClient {
	//public static ServerSocket soc;

	public static InetAddress remoteIP =  null;
	public static int port = 4700;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			remoteIP = InetAddress.getByName("localhost");
			
			DatagramSocket dsc = new DatagramSocket(4900);
			
			byte[] buf = new byte[256];
			byte[] buf1 = new byte[256];
			
			
			String str = null;
			for(int i =0;i<26;i++) {
				
				SocketAddress socketAddress=new InetSocketAddress(remoteIP,port);
				str = (char)('A'+i)+"";
				print("客户端发送："+str);
				byte[] outputData=str.getBytes();
                DatagramPacket outputPacket=new DatagramPacket(outputData,outputData.length,socketAddress);
                dsc.send(outputPacket);
                
                DatagramPacket packet = new DatagramPacket(buf,buf.length);
				dsc.receive(packet);
				buf1 = packet.getData();
				str = new String(buf1,0,buf1.length);
				print("客户端收到："+str);
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


