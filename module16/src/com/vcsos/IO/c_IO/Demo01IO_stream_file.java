package com.vcsos.IO.c_IO;

import java.io.*;

public class Demo01IO_stream_file {
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
            //6.打开阀门,流转数据(流到数据输入端)
            //TODO:阀门打开一次就关一次
            int data = inputStream.read();
            //7.打开阀门，流转数据(流到数据输出端)
            outputStream.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //4.将管道的声明和赋值分开,是为了写finally,用完管道之后关闭
            //TODO:close也有异常产生也要用try-catch
            if (inputStream!=null){  //为空会出现空指针******TODO:重点(不太理解)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            //5.out是一样的做法
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
