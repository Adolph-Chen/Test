package com.adolph.download;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetImage {
    public static HashSet<String> Set;

    public GetImage() {
    }

    public void getImage() {//�õ���ͼƬ�������ַ���  ���ҹ����ظ���
        try {
            Set = new HashSet<String>();
            print("���ڽ���...");
            Document document = Jsoup.parse(new File("E:\\web.html"), "utf-8");
            print("����html�ɹ���");
           // Elements images = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            Elements ele = document.getAllElements();
            Pattern p1 = Pattern.compile("\\S*\\.(?:png|jpe?g|gif)");
            Iterator var6 = ele.iterator();

            while(var6.hasNext()) {
                Element eles = (Element)var6.next();
                Matcher m = p1.matcher(eles.html());
                if (m.find()) {
                    Set.add(m.group(0));
                }
            }

            print("���elements!");
        } catch (IOException var8) {
            var8.printStackTrace();
        }

    }

    public static void print(String s) {
        System.out.println(s);
    }
}
