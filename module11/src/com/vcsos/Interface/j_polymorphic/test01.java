package com.vcsos.Interface.j_polymorphic;
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
        Dog dog = new Dog();
        method(dog);

        System.out.println("===============");

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal){//animal = dog    animal = cat
        /*  animal.eat();
         *//*
           这里会出现类型转换异常(ClassCastException)
           原因:当调用method,传递Cat对象时,animal代表的就是cat对象
               此时我们将代表cat对象的animal强转成了dog
               此时等号左右两边类型不一致了,所以出现了类型转换异常
         *//*
        Dog dog = (Dog) animal;
        dog.lookDoor();*/

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat();
            dog.lookdoor();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.eat();
            cat.drow();
        }
    }
}
