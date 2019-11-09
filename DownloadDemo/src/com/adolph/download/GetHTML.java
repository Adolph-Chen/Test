package com.adolph.download;
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class GetHTML {
    public static void getHtml() {
        Scanner sc = new Scanner(System.in);

        print("*************");
        print("输入你要得到图片的网页地址");
        print("*************");
        print("你好");

       try {
           URL url = new URL(sc.nextLine());

           //FileOutputStream outputStream = new FileOutputStream("E:\\");
           FileWriter fw = new FileWriter("E:\\web.html");
           BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
           String s;

           while((s = bf.readLine())!=null){
               fw.write(s);
               fw.flush();
           }
           fw.close();
           sc.close();
       }catch(Exception e){
           e.printStackTrace();
       }

    }


    private static void print(String s){
        System.out.println(s);
    }

}
