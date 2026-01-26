package com.vcsos.ClassStudy.c_code;

public class Person {
    public Person(){
        System.out.println("我是person中的无参构造方法");
    }
//2.执行特点:优先于构造方法执行,每new一次,就会执行一次
    {
        System.out.println("我是构造代码块");
    }
//静态代码块优先于构造代码块和构造方法执行的,而且只执行一次
    //使用场景:如果想让一些数据最先初始化,而且只需要初始化一次,就可以将这些数据放到静态代码块中
    static {
        System.out.println("我是静态代码块");
    }
}
