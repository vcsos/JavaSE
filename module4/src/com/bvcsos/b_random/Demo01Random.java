package com.bvcsos.b_random;
//随机数,用法通Scanner
import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random rd= new Random();
        int data =rd.nextInt();
        System.out.println("data="+data);
    }
}
