package com.vcsos.Exception.b_Expection;

import java.io.FileNotFoundException;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        String a=null;
        add(a);
        delete();
        update();
        find();
    }

    private static void find() {
        System.out.println("查询功能");
    }

    private static void update() {
        System.out.println("更新功能");
    }

    private static void delete() {
        System.out.println("删除功能");
    }

    private static void add(String a) throws FileNotFoundException,IOException{
        if (a==null){
            throw new IOException("IO异常");
        }
        if(!a.endsWith(".txt")){
            throw new FileNotFoundException("没有找到文件");
        }
    }
}
