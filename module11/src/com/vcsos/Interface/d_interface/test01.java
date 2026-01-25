package com.vcsos.Interface.d_interface;
//1.接口可以多继承 -&gt; 一个接口可以继承多个接口
//  public interface InterfaceA extends InterfaceB,InterfaceC{}
//2.接口可以多实现 -&gt; 一个实现类可以实现一个或者多个接口
//  public class InterfaceImpl implements InterfaceA,InterfaceB{}
//3.一个子类可以继承一个父类的同时实现一个或者多个接口
//  public class Zi extends Fu implements  InterfaceA,InterfaceB{}

//当一个类实现多个接口时,如果接口中的抽象方法有重名且参数一样的,只需要重写一次
//当一个类实现多个接口时,如果多个接口中默认方法有重名的,且参数一样的,必须重写一次默认方法
public class test01 {
}
