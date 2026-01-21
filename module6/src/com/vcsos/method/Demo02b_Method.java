package com.vcsos.method;

public class Demo02b_Method {
    //2.有参无返回值
    public static void main(String[] args) {
        sum(4,10);
    }

    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum="+ sum);
    }

}
