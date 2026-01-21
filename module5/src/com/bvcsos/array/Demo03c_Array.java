package com.bvcsos.array;

public class Demo03c_Array {
    public static void main(String[] args) {
        String[] str ={"古龙","杨过","小龙女","猪八戒","孙悟空"};
        System.out.print("[");
        for (int i = 0; i < str.length; i++) {
            if(i==str.length-1){
                System.out.print(str[i]+"]");
            }
            else{
                System.out.print(str[i]+",");
            }
        }
    }
}
