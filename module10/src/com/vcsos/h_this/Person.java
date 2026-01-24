package com.vcsos.h_this;
//1.this概述:代表的是当前对象(哪个对象调用的this所在的方法,this就代表哪个对象)
//2.作用:
//  a.区分重名的成员变量和局部变量
//  b.调用当前对象中的成员
//3.使用:
//  a.调用当前对象的构造:在构造中写
//    this():调用当前对象的无参构造
//    this(实参):调用当前对象的有参构造
//  b.调用当前对象的成员变量:
//    this.成员变量名
//  c.调用当前对象的成员方法:
//    this.成员方法名(实参)
//4.注意:
//  不管是super还是this,只要在构造中使用,都必须在第一行,所以二者不能同时手写出来
public class Person {
    int num = 10;
    public Person(){
        //this(10);
        System.out.println("我是Person中的无参构造");
    }

    public Person(int data){
        //super();super和this不能同时再构造中出现
        this();
        System.out.println("我是Person中的有参构造");
    }

    public void method(){
        int num = 20;
        System.out.println(num);//20
        System.out.println(this.num);//10
        this.method01();
        System.out.println("我是Person类中的method方法");
    }

    public void method01(){
        System.out.println("我是Person类中的method01方法");
    }
}