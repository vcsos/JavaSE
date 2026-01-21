package com.bvcsos.array;

public class Demo03d_Array {
    public static void main(String[] args) {
        //求数组中最大元素
        int[] sum={5,3,6,7,8,2,9};
        int max=sum[0];
        for (int i = 0; i < sum.length; i++) {
            if(sum[i]>max){
                max=sum[i];
            }
        }
        System.out.println(max);
    }
}
