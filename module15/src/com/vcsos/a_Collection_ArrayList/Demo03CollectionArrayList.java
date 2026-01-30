package com.vcsos.a_Collection_ArrayList;

import java.util.ArrayList;

public class Demo03CollectionArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //添加数据
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王二");
        arrayList.add("张三"); //数据可以重复
        //第二种创建方式
        ArrayList arrayList1 = new ArrayList(5);
        System.out.println("================================");
        //添加数据
        arrayList1.add("张良");
        arrayList1.add("李魁");
        arrayList1.add("王炸");
        arrayList1.add("张角"); //数据可以重复
        System.out.println("======================");
        //TODO:ArrayList的方法
        arrayList.add(1,"刘邦");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        System.out.println("======================");
        //判断是否为空---布尔型
        System.out.println(arrayList.isEmpty());
        System.out.println("======================");
        //清空数据
        //TODO:arrayList.clear();
        System.out.println("======================");
        //删除指定集合中的数据
        //TODO:arrayList.removeAll(arrayList1);
        System.out.println("======================");
        //判断是否包含该元素
        arrayList.contains("刘邦pro");
        System.out.println("======================");
        //获取数据在索引中的第一个位置,数据不存在返回-1
        System.out.println(arrayList.indexOf("张三"));//重复数据默认第一个
        System.out.println("======================");
        //获取数据在索引中最后一个位置
        System.out.println(arrayList.lastIndexOf("张三"));
        System.out.println("======================");
        //将集合转化为数组类型
        Object[] obj=arrayList.toArray();
        System.out.println(obj);//地址
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println("======================");
        //复制新集合
        Object clone=arrayList.clone();
        ArrayList list1 =(ArrayList) clone;
        System.out.println(list1);

    }
}
