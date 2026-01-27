package com.vcsos.ClassStudy.i_innerclass;

public class test03 {
    public static void main(String[] args) {
        //匿名内部类复杂用法_当返回值返回
        USB usb = method();
        usb.close();
    }
    public static USB method(){
        return new USB() {
            @Override
            public void open() {
                System.out.println("打开");
            }

            @Override
            public void close() {
                System.out.println("关闭");
            }
        };
    }
}
