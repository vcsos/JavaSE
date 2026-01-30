package com.vcsos.a_Collection_ArrayList;

import java.util.ArrayList;

public class Demo02CollectionArrayList {
    public static void main(String[] args) {
        //第一种创建方法
        ArrayList arrayList = new ArrayList();

        //第二种创建方式
        ArrayList arrayList1 = new ArrayList(5);
        //添加数据
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王二");
        arrayList.add("张三"); //数据可以重复
        System.out.println("================================");
        //TODO:遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("================================");
        //TODO:第二种方法
        for (Object obj: arrayList){
            System.out.println(obj);
        }
    }
}
