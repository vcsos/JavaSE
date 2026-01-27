package com.vcsos.ClassStudy.f_innerclass;

public class Person {
//    局部内部类,可以定义在方法中,代码块中,构造中
public void eat(){
    class Heart{
        public void jump(){
            System.out.println("心脏哐哐哐的跳");
        }
    }

    new Heart().jump();
}


}
