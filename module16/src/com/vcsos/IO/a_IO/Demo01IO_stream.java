package com.vcsos.IO.a_IO;

import java.io.File;
import java.io.IOException;

public class Demo01IO_stream {
    public static void main(String[] args) throws IOException {
        //TODO:java数据流操作
        //I:input输入
        //O:ouput输出
        //stream:流输
        String filePath = "E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\1.txt";
        File file = new File(filePath);
        //TODO:文件流操作
        //1.判断当前文件对象是否为文件
        System.out.println(file.isFile());
        //2.判断当前文件对象是否为文件夹
        System.out.println(file.isDirectory());
        //3.判断文件对象是否存在关联
        System.out.println(file.exists());
        //4.创建多级文件目录
        //file.mkdirs();
        //5.创建新文件
        //file.createNewFile();
        //6.获取文件名
        System.out.println(file.getName());
        //7.获取文件长度
        System.out.println(file.length());
        //8.获取文件最后修改的时间戳（毫秒值）
        System.out.println(file.lastModified());
        //9.获取文件绝对路径
        System.out.println(file.getAbsolutePath());
        //10.快速获取文件名列表
        String[] fileNames = file.list();
        if (fileNames != null) {
            for (String name : fileNames) {
                System.out.println(name);
            }
        }
        //11.功能更全，适合需要操作文件的场景
        System.out.println(file.listFiles());
    }
}
