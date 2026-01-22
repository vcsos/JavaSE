package com.vcsos.staticLearn.a_static;

public class test01 {
    public static void main(String[] args) {
        //先给静态成员赋值
        Animal.age=10;

        Animal animal = new Animal();
        animal.setName("张三");
        System.out.println(animal.getName()+","+Animal.age);

        Animal animal1 =new Animal();
        animal1.setName("lsisi");
        System.out.println(animal1.getName()+","+Animal.age);

    }
}
