package com.adolph.download;

public class DownloadPicture {
	public static void main(String[] args){
	GetHTML.getHtml();//�Ȼ����ҳ��html�ļ�
	GetImage gi = new GetImage();  
    gi.getImage();
    Change.change(); 
    //���������Ƿ������е�ͼƬ����  �����ǿ�ʶ��img��ǩ�����  �����ܶ���վʲô����ȡ����
    DownTask.create();
    //�����̳߳�
    DownTask.play();
    //��������
    DownTask.pause();
    //�����̳߳�
	}
}
