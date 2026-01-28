package com.vcsos.Exception.f_object;

import java.util.ArrayList;
//1.Object中的toString方法:返回该对象的字符串表示形式
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
//
//2.注意:
//  a.如果没有重写Object中的toString方法,直接输出对象名会默认调用Object中的toString方法,直接输出地址值
//  b.如果重写了Object中的toString方法,再输出地址值,重写没有意义,所以重写完toString之后,应该返回对象的内容
//
//3.总结:
//  如果直接输出对象名不想输出地址值,就重写Object中的toString方法!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//快速生成toString
//
//alt+insert -> 选择toString -> 直接下一步
public class test01 {
    public static void main(String[] args) {
        Person p1 = new Person("金莲", 26);
        System.out.println(p1);//com.atguigu.b_object.Person@4eec7777
        System.out.println(p1.toString());//com.atguigu.b_object.Person@4eec7777

        System.out.println("==============");

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        System.out.println(list.toString());//[张三, 李四, 王五]
    }
}
