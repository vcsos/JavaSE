package com.vcsos.Extends.l_abstract;
//1.抽象类不能直接new对象,只能创建非抽象子类的对象
//2.抽象类中不一定非得有抽象方法,但是抽象方法所在的类一定抽象类
//3.抽象类的子类,必须重写父类中的所有抽象方法,否则,编译报错,除非该子类也是抽象类
//4.抽象类中可以有成员变量,构造,成员方法
//5.抽象类中可以有构造方法,是供子类创建对象时,初始化父类属性使用的
public class test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        System.out.println("===================");
        Cat cat = new Cat();
        cat.eat();
        cat.drink();
    }
}
