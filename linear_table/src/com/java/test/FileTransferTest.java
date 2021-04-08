package com.java.test;

import java.io.*;

public class FileTransferTest {

    private long transferFile(File source,File desc)throws Exception{

        long startTime=System.currentTimeMillis();

        if(!desc.exists()) desc.createNewFile();

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(desc));

        //将数据源读到的内容写到目的地
        byte[] bytes = new byte[1024 * 1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //当前线程的名称
        Thread thread=new Thread();
        String name = thread.getName();
        System.out.println(name);

        long endTime=System.currentTimeMillis();

        return endTime-startTime;
    }

    public static void main(String[] args) throws Exception{
        File src=new File("D:\\BaiduNetdiskDownload\\jdk-8u144-windows-x64.exe");
        //输出流名称必须为文件，不能为目录
        File desc=new File("D:\\JSE\\study.txt");

        FileTransferTest fileTransferTest=new FileTransferTest();
        long time = fileTransferTest.transferFile(src, desc);
        System.out.println(time);


    }

}
