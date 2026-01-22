package com.vcsos.privates.d_constructor;

public class Person {
    private String name;
    private int age;


//    每一个类中默认有一个无参构造
    public Person(){
        System.out.println("我是无参构造" + "你是啥");
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
