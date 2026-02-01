package com.vcsos.Thread.d_thread;

public class Demo02Thread {
    public static void main(String[] args) {
        //运行
        MyThread3 t3 = new MyThread3();
        t3.start();

        MyThread4 t4 = new MyThread4();
        t4.start();

        System.out.println("main线程执行");
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("t3线程执行");
    }
}
class MyThread4 extends Thread{
    @Override
    public void run() {
        System.out.println("t4线程执行");
    }
}
