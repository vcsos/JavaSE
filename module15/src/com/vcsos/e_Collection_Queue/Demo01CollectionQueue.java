package com.vcsos.e_Collection_Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo01CollectionQueue {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(16);//定义时要有数据容量
        //增加数据1
        queue.add("刘邦");
        queue.add("刘备");
        queue.add("刘秀");
        //增加数据2
        queue.put("刘彻");
        queue.put("刘裕");//数据容量满,再次存入数据会产生阻塞
        queue.put("刘禅");

        //增加数据3
        boolean ifx=queue.offer("汉文帝");//布尔类型,添加数据成功了返回的是true
        //System.out.println(ifx);

        System.out.println(queue);


        //取出数据1,无数据返回null
        String S=queue.poll();
        //System.out.println(S);
        queue.poll();

        //取出数据2:
        Object s = queue.take();//取完会产生阻塞
        System.out.println(s);
        System.out.println(queue);
    }
}
