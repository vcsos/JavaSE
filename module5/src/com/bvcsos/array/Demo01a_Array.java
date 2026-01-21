package com.bvcsos.array;

import java.util.Scanner;

public class Demo01a_Array {
    public static void main(String[] args) {
        //动态初始化数组
        int[] arr = new int[4];
        String[] arr2 = new String[3];
        //简化静态初始化
        int[] arr4 = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        int j = 0;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }
    }
}
