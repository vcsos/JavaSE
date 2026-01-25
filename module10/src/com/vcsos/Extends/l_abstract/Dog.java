package com.vcsos.Extends.l_abstract;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void drink() {
        System.out.println("狗喝水");
    }
}