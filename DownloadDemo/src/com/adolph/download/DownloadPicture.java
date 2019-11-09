package com.adolph.download;

public class DownloadPicture {
	public static void main(String[] args){
	GetHTML.getHtml();//先获得网页的html文件
	GetImage gi = new GetImage();  
    gi.getImage();
    Change.change(); 
    //以上三行是分析其中的图片链接  并不是靠识别img标签来获得  那样很多网站什么都获取不到
    DownTask.create();
    //创建线程池
    DownTask.play();
    //下载任务
    DownTask.pause();
    //销毁线程池
	}
}
