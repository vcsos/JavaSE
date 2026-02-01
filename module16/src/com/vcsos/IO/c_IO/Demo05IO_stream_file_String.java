package com.vcsos.IO.c_IO;

import java.io.*;

public class Demo05IO_stream_file_String {
    public static void main(String[] args){
        //1.创建文件对象
        File srcfile = new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt");
        File desfile =new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt.copy");
        //2.创建管道对象(可能会有异常产生,用try-catch)
        BufferedReader reader =null;//字符输入流

        PrintWriter writer =null;
        try {
            reader = new BufferedReader(new FileReader(srcfile));//文件输入流
            writer = new PrintWriter(desfile);//文件输出流
            //读取文件中的一行数据
            String line = null;

            while ((line=reader.readLine())!=null) {
                writer.println(line);
            }
            //刷写数据
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (writer!=null) {
                writer.close();
            }
        }
    }
}
