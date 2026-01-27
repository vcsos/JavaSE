package com.vcsos.Exception.a_Expection;

public class test01 {
    public static void main(String[] args) throws Exception {
        String a="111.txt4";
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

    private static void add(String a) throws Exception{
        if(!a.endsWith(".txt")){
            throw new Exception("没有找到文件");
        }
    }
}
