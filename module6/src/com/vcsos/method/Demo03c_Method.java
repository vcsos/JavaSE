package com.vcsos.method;

import java.util.Scanner;

public class Demo03c_Method {
//    需求:
//    键盘录入一个整数,将整数传递到另外一个方法中,在此方法中判断这个整数的奇偶性
//    如果是偶数,方法返回"偶数"  否则返回"奇数"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data=scanner.nextInt();
        String result = method(data);
        System.out.println(result);
    }

    public static String method(int m){
        if (m%2==0){
            return "偶数";
        }
        else {
            return "奇数";
        }
    }
}
