package com.bvcsos.b_random;
//随机数,用法通Scanner
import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random rd=new Random();
        //在1-100中随机数字
        int data =rd.nextInt(100)+1;
        System.out.println(data);

        System.out.println("==================================");
        //在100-999中随机数字
        int data1=rd.nextInt(900)+100;
        System.out.println(data1);
    }
}
