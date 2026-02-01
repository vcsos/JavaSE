package com.vcsos.Thread.d_thread;

public class Demo01Thread {
    public static void main(String[] args) throws Exception{
        //运行
        MyThread5 t5 = new MyThread5();
        t5.start();

        MyThread6 t6 = new MyThread6();
        t6.start();
        MyThread7 t7 = new MyThread7("t7");
        MyThread7 tt7 = new MyThread7("tt7");
        t7.start();
        tt7.start();
//        TODO:构建线程对象时,可以只把逻辑传给这个对象
//        传递逻辑时,需要遵循规则:() -> { 逻辑 }
        Thread t9 = new Thread(() ->{
            System.out.println("线程执行");
        });
        t9.start();

        //TODO:构建线程对象时,可以传递Runnable接口的类的对象,一般用匿名类
        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名类线程执行");
            }
        });
        System.out.println("main线程执行");
    }
}

//自定义线程
//继承线程父类
//重写run方法

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("t3线程执行");
    }
}
class MyThread6 extends Thread{
    @Override
    public void run() {
        System.out.println("t4线程执行");
    }
}

class MyThread7 extends Thread{
    private String threadName;
    public MyThread7(String name){
        threadName = name;
    }
    @Override
    public void run() {
        System.out.println(threadName+"线程执行");
    }
}