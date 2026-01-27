package com.vcsos.ClassStudy.i_innerclass;

public class test02 {
    public static void main(String[] args) {
        //匿名内部类复杂用法_当参数传递
        method01(new USB() {
                     @Override
                     public void open() {
                         System.out.println("鼠标打开");
                     }

                     @Override
                     public void close() {
                         System.out.println("鼠标关闭");
                     }
                 }
        );

    }
    public static void method01(USB usb){
        usb.open();
        usb.close();
    }
}
