package com.bvcsos.array;

public class Demo05f_Array {
    public static void main(String[] args) {
        //二维数组动态初始化
        int m=4;
        int[][] arr1 =new int[m][];

        //静态初始化
        String[][] arr3 = {{"孙悟空","唐僧"},{"刘备","关羽","张飞"},{"宋江"},{"林黛玉","贾宝玉","王熙凤","薛宝钗"}};


        //获取二维数组长度
        System.out.println(arr3.length);

        //打印二维数组
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }
    }
}
