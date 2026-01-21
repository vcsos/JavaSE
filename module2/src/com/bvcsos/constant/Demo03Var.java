package com.bvcsos.constant;
/*变量*/
public class Demo03Var {
    public static void main(String[] args) {
        /*
        变量：
            基础数据类型：（四类八种）
                整型：byte int short long
                浮点型：float double
                布尔型：boolean
                字符型：char
            引用数据类型：类 数组 接口 枚举 注解
         */

        //整型变量
        byte num1=100;
        System.out.println(num1);

        short num2=4000;
        System.out.println(num2);

        int num3=1000;
        System.out.println(num3);

        long num4=10000L;
        System.out.println(num4);

        //浮点型
        float num5=100.0f;
        System.out.println(num5);

        double num6=100.0;
        System.out.println(num6);

        //布尔型
        boolean num7=true;
        System.out.println(num7);

        //字符型
        char num8='a';
        System.out.println(num8);

        //重要声明：String类型不是基础数据类型，而是引用数据类型中类的一种，但是用法同基础数据类型一样。

        String num9="a is the clion";
        System.out.println(num9);
    }
}