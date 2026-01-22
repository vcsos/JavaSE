package com.vcsos.staticLearn.d_var;

public class Demo01Var {
    public static void main(String[] args) {
        sum(1,244,5,6);
    }

    public static void sum(int...arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
