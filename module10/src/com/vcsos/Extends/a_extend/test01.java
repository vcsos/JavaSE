package com.vcsos.Extends.a_extend;

public class test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "山东";
        teacher.age = 18;
        System.out.println(teacher.name+"..."+teacher.age);
        teacher.work();
        //teacher.eat();子类继承父类之后不能使用父类私有成员,只能使用父类非私有成员

        System.out.println("============");

        Manager manager = new Manager();
        manager.name = "蓝翔";
        manager.age = 18;
        System.out.println(manager.name+"..."+manager.age);
        manager.work();
    }
}
