package com.vcsos.object.a_object;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01Object {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String data = sc.next();
        System.out.println("data="+data);

        System.out.println("==============================");

        int[] arr1={1,2,3,4,5,6};

        //调用带static静态关键字的可以不需要new
        System.out.println(Arrays.toString(arr1));
    }

}
