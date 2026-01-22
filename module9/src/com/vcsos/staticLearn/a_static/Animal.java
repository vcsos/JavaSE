package com.vcsos.staticLearn.a_static;

public class Animal {
    //static是一个静态关键字
    static int age;
    private String name;
    //调用,类名直接调用
    /*静态成员特点
    * 1.属于类成员,不属于对象成员(非静态属于对象成员)
    * 2.静态成员会随着类的加载而加载
    * 3.静态成员优先于非静态成员存在在内中
    * 4.凡是静态成员所在的类创建出来的对象,都可以共享这个静态成员
    *
    * */

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Animal.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
