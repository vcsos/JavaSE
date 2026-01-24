package com.vcsos.h_this;

public class test01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("========");
        Person person1 = new Person(10);
        System.out.println("========");
        Person person2 = new Person();
        person2.method();
    }
}
