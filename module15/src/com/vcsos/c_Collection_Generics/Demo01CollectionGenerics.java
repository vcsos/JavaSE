package com.vcsos.c_Collection_Generics;

import java.util.LinkedList;

public class Demo01CollectionGenerics {
    public static void main(String[] args) {
//1.概述:单列集合的顶级接口
//2.使用:
//  a.创建:
//    Collection<E> 对象名 = new 实现类对象<E>()
//  b.<E>:泛型,决定了集合中能存储什么类型的数据,可以统一元素类型
//        泛型中只能写引用数据类型,如果不写,默认Object类型,此时什么类型的数据都可以存储了
//        <int> 不行
//        <Integer> 行
//        <Person> 行
//
//  c.泛型细节:
//    我们等号前面的泛型必须写,等号后面的泛型可以不写,jvm会根据前面的泛型推导出后面的泛型是啥
        LinkedList<String> list = new LinkedList<>();
        list.add("19");
       //list.add(10);这个不能
        list.add(":liubang");
        System.out.println(list);
    }
}
