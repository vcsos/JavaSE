package com.vcsos.Thread.e_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02Thread {
    public static void main(String[] args) {
        //TODO:根据需求动态创建线程
        ExecutorService executorService = Executors.newCachedThreadPool();
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
