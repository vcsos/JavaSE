package com.vcsos.Thread.a_thread;

public class Demo01Thread {
    public static void main(String[] args) {
        //线程
        //Thread是线程类
        //currentThread方法用于获取当前正在运行的线程
        //getName方法用于获取线程的名称
        //main方法运行在main线程中
        System.out.println(Thread.currentThread().getName());
    }
}
