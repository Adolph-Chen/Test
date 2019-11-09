package com.adolph.download;
import java.io.*;
import java.net.*;
public class Task implements Runnable{
	private String picSourceURL;
	private String picDestPath;
	public Task(String picSourceURL, String picDestPath) {
		this.picSourceURL = picSourceURL;
		this.picDestPath=picDestPath;
	}	
	public void run() {
			//accept connection and communicate
	BufferedOutputStream bos = null;
	BufferedInputStream bis = null;		
			try {
				URL url = new URL(picSourceURL);			
				bis = new BufferedInputStream(url.openStream());			
				bos = new BufferedOutputStream(new FileOutputStream(picDestPath));			
				byte[] b = new byte[1024 * 1024];
				int len = 0;
				print("��������"+this.picDestPath+"......");
				while ((len = bis.read(b)) != -1) {
					bos.write(b, 0, len);
					bos.flush();
				}
				
				print("���سɹ�������");
					
				}catch(Exception e) {
					print("����ʧ�ܣ�����");
					e.printStackTrace();
				}
				finally {
					
					try {		
				bos.close();		
				} catch (Exception e){
					e.printStackTrace();
				}			
					try {			
						bis.close();			
					}catch (Exception e){
						e.printStackTrace();
					}		
			}
				
}
	public static void print(String s) {
    	System.out.println(s);
    }

}
