package com.vcsos.b_Collection_LinkList;

import java.util.LinkedList;

public class Demo01CollectionLinkList {
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

        //获取数据
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("=====================");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=====================");

        //遍历集合2
        for (Object obj : list){
            System.out.println(obj);
        }
        System.out.println("=====================");

        //修改数据
        list.set(0,"汉高祖");
        //删除数据
        //list.remove("萧何");
        System.out.println(list);
    }
}
