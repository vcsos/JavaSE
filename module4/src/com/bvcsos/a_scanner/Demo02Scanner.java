package com.bvcsos.a_scanner;
//1.导入包
import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        //键盘录入年龄,用三元运算符比较大小
        Scanner old = new Scanner(System.in);
        int old1 = old.nextInt();
        int old2 = old.nextInt();
        int old3 = old.nextInt();
        int temp= old1>old2?old1:old2;
        int max=temp>old3?temp:old3;
        System.out.println(max);
    }
}
