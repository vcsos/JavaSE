package com.vcsos.Interface.i_polymorphic;


public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    //特有方法
    public void drow(){
        System.out.println("猫会捉老鼠");
    }

}
