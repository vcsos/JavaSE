package com.vcsos.object.b_object;

public class Demo02Phone {
    public static void main(String[] args) {
        Phone ph= new Phone();
        ph.brand="vivo";
        ph.color="black";
        ph.price=8545.39;

        ph.email();
        ph.call("张政凯");
        System.out.println(ph.brand+'\n'+ph.color+'\n'+ph.price);
    }
}
