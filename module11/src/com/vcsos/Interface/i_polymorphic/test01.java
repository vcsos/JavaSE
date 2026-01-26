package com.vcsos.Interface.i_polymorphic;

//转型可能会出现的问题
//1.如果等号左右两边类型不一致,会出现类型转换异常(ClassCastException)
//2.解决:
//  在向下转型之前,先判断类型
//3.怎么判断类型: instanceof
//  判断结果是boolean型
//
//4.使用:
//  对象名 instanceof 类型 -> 判断的是关键字前面的对象是否符合关键字后面的类型
public class test01 {
    public static void main(String[] args) {
        //多态new对象
        Animal animal = new Dog();
        animal.eat();
        //animal.lookdoor();//多态不能调用子类的方法
        Dog dog = (Dog) animal;
        dog.lookdoor();

    }
}

