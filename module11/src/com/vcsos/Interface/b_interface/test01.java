package com.vcsos.Interface.b_interface;

public class test01 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.method01();
        USB.method02();//静态方法用接口直接调用
    }
}
