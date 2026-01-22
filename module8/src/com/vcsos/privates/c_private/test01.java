package com.vcsos.privates.c_private;


public class test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(77);

        String name=person.getName();
        int age=person.getAge();

        System.out.println(name);
        System.out.println(age);
    }
}
