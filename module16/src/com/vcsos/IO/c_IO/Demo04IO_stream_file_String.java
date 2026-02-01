package com.vcsos.IO.c_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04IO_stream_file_String {
    public static void main(String[] args){
        //1.创建文件对象
        File srcfile = new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt");
        File desfile =new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt.copy");
        //2.创建管道对象(可能会有异常产生,用try-catch)
        FileInputStream inputStream=null;//文件输入流
        FileOutputStream outputStream=null;//文件输出流
        try {
            inputStream = new FileInputStream(srcfile);//文件输入流
            outputStream = new FileOutputStream(desfile);//文件输出流
            int data=-1;

            StringBuilder ss = new StringBuilder();

            while ((data=inputStream.read())!=-1) {
                //outputStream.write(data);
                ss.append((char)data);
            }
            ss.append("张三");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (outputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
