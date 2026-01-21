package com.vcsos.object.b_object;

public class Person {
    //属性
    int age;
    String name;
    String gender;
    double height;
    double longth;


    //成员方法
    public void eat(){
        System.out.println("eating");
    }

    public void drink(){
        System.out.println("Drink");
    }

    public String email(String name){
        System.out.println("给"+name+"发短信");
        return "好的";
    }
}