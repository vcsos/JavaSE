package com.vcsos.staticLearn.b_static;

public class test01 {
    public static void main(String[] args) {
        //在静态方法中不能直接访问非静态成员,如果非要调用,需要new对象
        test01 Test01 = new test01();
        Test01.method03();

        Person person = new Person();
        person.eat();
    }

    public static void method01(){
        //同类静态调用静态
        method02();

        //不同类静态调用静态
        Person.drink();
    }

    public static void method02(){

    }

    public void method03(){
        System.out.println("我是method03");
        //同类中非静态成员访问静态成员,能直接访问
        method01();
        test01.method02();
        //不同类中非静态成员访问静态成员
        Person.drink();  //类名调用


    }
}
