package com.vcsos.Thread.f_thread;

public class Demo01Thread {
    public static void main(String[] args) {
        //线程同步
        //synchronized 同步关键字
        //TODO:多个线程访问同步方法时,只能一个一个访问
        //new Hashtable<>();
        //同步代码块(synchronized 同步关键字还可以修饰代码块)
    /*
        synchronized(用于同步的对象){
            处理逻辑
        }

    */

//          main方法启动
//
//          创建Num对象（作为锁）
//
//          启动User线程
//
//          User线程获取num锁，打印信息，调用wait()释放锁并等待
//
//          短暂延迟后启动Bank线程
//
//          Bank线程获取num锁，sleep 2秒后打印信息
//
//          Bank线程调用notify()唤醒User线程
//
//          User线程恢复执行，打印最后一条信息
//
//          这样就能正常演示线程间的wait/notify通信机制了。
        Num num = new Num();
        User user = new User(num);
        user.start();

        Bank bank = new Bank(num);
        bank.start();
    }
}
class Num{

}
class Bank extends Thread{
    private Num num;
    public Bank(Num num){
        this.num=num;
    }
    public void run(){
        synchronized (num){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("9:00,开发,开始叫号");
            num.notify();
        }
    }
}

class User extends Thread{
//    public synchronized void test(){
//
//    }
    private Num num;
    public User(Num num){
        this.num=num;
    }
    public void run(){
        synchronized (num){
            System.out.println("我是号码1,银行还没开门,我需要等一等");
            try {
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("叫到我的号了,到我了");
        }
    }
}