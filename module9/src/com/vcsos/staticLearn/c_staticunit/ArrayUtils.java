package com.vcsos.staticLearn.c_staticunit;

public class ArrayUtils {

    private ArrayUtils(){

    }

    public static int getArray(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
