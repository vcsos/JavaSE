package com.vcsos.Thread.c_thread;

public class Demo01Thread {
    public static void main(String[] args) throws Exception{
        //TODO:线程休眠
        //休眠2s
//        Thread.sleep(2000);//是一个静态方法
//        System.out.println("main线程执行完毕");
        while(true){
            Thread.sleep(2000);//是一个静态方法
            System.out.println("main线程执行完毕");
        }
    }
}
