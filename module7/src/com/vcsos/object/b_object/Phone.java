package com.vcsos.object.b_object;

public class Phone {
    String brand;
    String color;
    double price;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public String email(){
        return "给我打电话";
    }
}
