package com.vcsos.Thread.b_thread;

public class Demo01Thread {
    public static void main(String[] args)throws Exception {
        //TODO:线程---执行方式:串行,并发
        //串行执行,多个线程链接成串,然后按照顺序执行
        //并发执行,多个线程独立,谁抢到了cpu的执行权,谁就先执行
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

        //将线程连接成串
        myThread1.join();
        myThread2.join();

        System.out.println("main线程执行完毕");
    }
}

class MyThread1 extends Thread{
    //重写运行指令
    public void run(){
        System.out.println("MyThread1:"+Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread{
    //重写运行指令
    public void run(){
        System.out.println("MyThread2:"+Thread.currentThread().getName());
    }
}