package com.vcsos.Exception.c_Expection;

import java.io.FileNotFoundException;
import java.io.IOException;

public class test01 {
    public static void main(String[] args){
        String s ="2a.txt1";
        try{
            //int[] arr = null;
            //System.out.println(arr.length);//NullPointerException
            add(s);//添加功能
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

        delete();//删除功能
        update();//修改功能
        find();//查询功能
    }


    private static void add(String s)throws FileNotFoundException,IOException {
        if (s==null){
            throw new IOException("文件为空");
        }
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }

    private static void find() {
        System.out.println("查询功能");
    }

    private static void update() {
        System.out.println("修改功能");
    }

    private static void delete() {
        System.out.println("删除功能");
    }
}
