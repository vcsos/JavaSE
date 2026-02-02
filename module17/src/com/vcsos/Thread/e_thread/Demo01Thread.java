package com.vcsos.Thread.e_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01Thread {
    public static void main(String[] args) {
        //TODO:创建固定数量的线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
