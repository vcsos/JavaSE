package com.vcsos.Thread.a_thread;

public class Demo02Thread {
    public static void main(String[] args) {
        //创建线程
        MyThread t = new MyThread();
        //启动线程
        t.start();

        System.out.println(Thread.currentThread().getName());
    }
}


//声明自定义的线程类
class MyThread extends Thread{
    //重写运行指令
    public void run(){
        System.out.println("MyThread:"+Thread.currentThread().getName());
    }
}