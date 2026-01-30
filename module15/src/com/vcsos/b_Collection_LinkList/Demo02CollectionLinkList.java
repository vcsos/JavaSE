package com.vcsos.b_Collection_LinkList;

import java.util.LinkedList;

public class Demo02CollectionLinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //增加数据
        list.add("刘邦");
        list.addFirst("张角");
        list.addLast("樊哙");
        list.add(1,"韩信");
        list.addFirst("萧何");
        System.out.println("=====================");
        System.out.println(list);
        System.out.println("=====================");

        //element获取第一个数据
        System.out.println(list.element());
        System.out.println("=====================");

        //添加数据,添加在第一个位置
        list.push("汉武帝");
        System.out.println(list);
        System.out.println("=====================");
        //弹出数据
        list.pop();
        System.out.println(list);
    }
}
