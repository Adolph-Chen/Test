package w1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Study3Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			Socket sc = new Socket(InetAddress.getByName("localhost"),4600);
			InputStreamReader ir = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			//OutputStreamWriter ow = new OutputStreamWriter(sc.getOutputStream());
			//BufferedWriter bw = new BufferedWriter(ow);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())),true);
			String s;
			while(true){
				s = scan.nextLine();
				pw.println(s);
				//bw.write(s);
			
				//bw.flush();
				
				print(br.readLine());
				if(s.equals("bye")||s.equals("byebye")){
					
					break;
					
				}
				
			}
			scan.close();
			br.close();
			pw.close();
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void print(String s) {
		System.out.println(s);
	}

}
