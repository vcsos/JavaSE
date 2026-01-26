package com.vcsos.Interface.g_polymorphic;

public class test01 {
    public static void main(String[] args) {
        //原始方法
        Dog dog = new Dog();
        dog.eat();
        dog.lookdoor();

        Cat cat = new Cat();
        cat.eat();
        cat.drow();

        System.out.println("=================");

        Animal animal = new Dog();
        animal.eat();
        //animal.lookdoor();不能调用特有方法

        Animal animal1 = new Cat();
        animal1.eat();
    }
}
