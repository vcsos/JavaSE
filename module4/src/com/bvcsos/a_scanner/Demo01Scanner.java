package com.bvcsos.a_scanner;
//1.导入包
import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建对象
        Scanner sc =new Scanner(System.in);
        //3.调用对象
        //录入整型
        int sum=sc.nextInt();
        System.out.println(sum);

        //录入字符串型
        String str=sc.next();
        System.out.println(str);
    }
}
