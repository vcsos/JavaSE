package com.vcsos.i_this;
//1.继承只支持单继承,不能多继承
//  public class A extends B,C{}  -> 错误
//2.继承支持多层继承
//  public class A extends B{}
//  public class B extends C{}
//3.一个父类可以有多个子类
//  public class A extends C{}
//  public class B extends C{}
//
//4.构造方法不能继承,也不能重写
//  私有方法可以继承,但是不能被重写
//  静态方法可以继承,但是不能被重写
public class test01 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method03();
        Zi.method03();
    }
}
