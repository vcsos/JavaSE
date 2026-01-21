package com.bvcsos.arithematic;
//字符串拼接:任何类型的数据遇到字符串都会变成字符串,此时+就不再是运算了,而是字符串拼接,将内容直接往后拼接
public class Demo02Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        System.out.println(i+j+"");//13
        System.out.println(i+j+""+1);//131
        System.out.println(i+""+j);//103

        System.out.println("i和j相加只和为:"+(i+j));
    }
}
