package com.vcsos.Interface.b_interface;

public interface USB {
    //默认方法
    public default void method01(){
        System.out.println("我是默认方法");
    }

    //静态方法
    public  static void method02(){
        System.out.println("我是静态方法");
    }
}
