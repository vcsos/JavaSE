package com.vcsos.ClassStudy.e_innerclass;

public class test01 {
    public static void main(String[] args) {
        // 外部类.内部类 对象名 = new 外部类().new 内部类()
        Person.eating person = new Person().new eating();
        person.eatLunch();
    }
}
