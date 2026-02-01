package com.vcsos.IO.b_IO;

import java.io.File;

public class Demo01IO_stream_file {
    public static void main(String[] args) throws Exception{
        String filePath = "E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\newfile";
        File file = new File(filePath);
        if (file.exists()){
            //当文件对象存在关联时
            System.out.println("文件对象存在");
            //然后判断这个文件是文件夹还是文件
            if (file.isFile()) {
                System.out.println("文件对象关联的是一个文件");
            }else if (file.isDirectory()){
                System.out.println("");
            }
        }else {
            //文件对象不存在时
            System.out.println("文件对象不存在,没有关联成功");
            //创建多级文件目录
            //file.mkdirs();
            //创建文件
            file.createNewFile();
        }
    }
}
