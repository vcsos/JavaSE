package com.vcsos.Interface.j_polymorphic;




public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void lookdoor(){
        System.out.println("狗会看门");
    }
}
