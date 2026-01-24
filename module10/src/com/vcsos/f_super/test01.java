package com.vcsos.f_super;
//1.注意:new子类对象时,会先初始化父类(先走父类无参构造方法)
//2.原因:
//  每个构造方法的第一行,默认都会有一个super(),不写jvm自动提供一个
//  super()代表的是父类无参构造
public class test01 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("===========");
        Zi zi1 = new Zi(10);
    }
}
