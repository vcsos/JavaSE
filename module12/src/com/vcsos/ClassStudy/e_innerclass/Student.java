package com.vcsos.ClassStudy.e_innerclass;

public class Student {
    //外部类的成员变量和内部类的成员变量以及内部类的局部变量重名时,怎么区分?
    private String name="赵云";

    class studentId{
        String name="刘备";
        public void getName(String name){
            System.out.println(name); //内部类的局部变量
            System.out.println(this.name);//这是内部类的成员变量
            System.out.println(Student.this.name);//这是外部类的成员变量
        }
    }
}
