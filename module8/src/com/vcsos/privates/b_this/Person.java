package com.vcsos.privates.b_this;

public class Person {
    String name;

    public void speak(String name){
        /*哪个对象调用this所在的方法,this就代表哪个对象*/
        System.out.println(this.name+"你好,我是"+name);
    }
}
