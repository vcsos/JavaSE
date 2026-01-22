package com.vcsos.privates.a_private;

public class test01 {
    public static void main(String[] args) {
        Person person = new Person();
        //name没有私有化,可以使用,若私有化了,则需在那个类汇总用get和set,为属性获取,赋值进行操作

        person.setName("张三");
        person.setAge(18);

        String name=person.getName();
        int age=person.getAge();

        System.out.println(name);
        System.out.println(age);
    }
}
