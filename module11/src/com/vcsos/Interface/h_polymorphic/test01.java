package com.vcsos.Interface.h_polymorphic;

public class test01 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();//调用dog中的eat

        animal = new Cat();
        animal.eat();

        System.out.println("================");

        Dog dog = new Dog();
        method01(dog);
        Cat cat = new Cat();
        method01(cat);
    }


    public static void method01(Animal animal){
        animal.eat();
    }
}
