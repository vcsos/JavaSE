package com.bvcsos.d_if;

import java.util.Scanner;

public class Demo01if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 =sc.nextInt();
        int data2 =sc.nextInt();
        if(data1==data2){
            System.out.println("相等");
        }
    }
}
