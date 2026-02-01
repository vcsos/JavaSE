package com.vcsos.IO.c_IO;

import java.io.*;

public class Demo03IO_stream_file_Buffer {
    public static void main(String[] args){
        //1.创建文件对象
        File srcfile = new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt");
        File desfile =new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt.copy");
        //2.创建管道对象
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;
        //3.创建缓冲输入输出流
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        //4.缓冲区(水桶)------数据从数据输入端传入缓冲区
        byte[] cache = new byte[1024];
        try {
            inputStream = new FileInputStream(srcfile);
            outputStream = new FileOutputStream(desfile);
            //创建管道对象
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            int data = -1;
            //TODO:判断是否读到结尾
            while ((data=bufferedInputStream.read(cache))!=-1) {
                bufferedOutputStream.write(cache,0,data);//从开头读到结尾
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //当输入端数据为空,会使输入水桶中的数据功能关闭
            if (bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (bufferedOutputStream!=null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
