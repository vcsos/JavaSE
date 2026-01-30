package com.vcsos.a_Collection_ArrayList;

import java.util.ArrayList;

public class Demo01CollectionArrayList {
    public static void main(String[] args) {
        //第一种创建方法
        ArrayList arrayList = new ArrayList();

        //第二种创建方式
        ArrayList arrayList1 = new ArrayList(5);
        System.out.println("================================");
        //添加数据
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王二");
        arrayList.add("张三"); //数据可以重复
        System.out.println(arrayList);
        System.out.println("=============================");
        //获取指定位置数据
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));

        System.out.println("==============================");
        //获取集合数据个数
        System.out.println(arrayList.size());
        System.out.println("==============================");
        //TODO:修改数据,该方法会返回修改前的数据
        Object obj = arrayList.set(1,"Lvcsos");
        System.out.println(obj);
        System.out.println("==============================");
        //删除数据:该方法会返回修改前的数据
        Object obj1 = arrayList.remove(1);
        System.out.println(obj1);
        System.out.println("==============================");
    }
}
