package com.vcsos.j_this;
//问题:如何为父类中private的成员变量赋值(经验值)
//利用set赋值
public class test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("涛哥");
        teacher.setAge(18);
        System.out.println(teacher.getName()+"..."+teacher.getAge());
    }
}
