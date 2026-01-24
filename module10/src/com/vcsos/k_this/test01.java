package com.vcsos.k_this;
//4.2.利用构造方法赋值
public class test01 {
    public static void main(String[] args) {
        Manager manager = new Manager("金莲", 24);
        System.out.println(manager.getName()+"..."+manager.getAge());
    }
}
