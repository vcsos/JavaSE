package com.bvcsos.c_switch;

import java.util.Scanner;
//case的穿透性
public class Demo01Switch {
    //switch语句用法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int data = sc.nextInt();
        switch(data){
            case 1:
                System.out.println("此件");
                break;
            case 2:
                System.out.println("地域");
                break;
            case 3:
                System.out.println("中国");
                break;
            default:
                System.out.println("不在范围");
                break;
        }
    }
}
