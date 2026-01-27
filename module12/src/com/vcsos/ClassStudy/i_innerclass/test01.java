package com.vcsos.ClassStudy.i_innerclass;

public class test01 {
    //1.问题描述:我们如果想实现接口,简单使用一次抽象方法,我们就需要创建一个实现类,实现这个接口,重写抽象方法,还要new实现类对象,所以我们在想如果就单纯的想使用一次接口中的方法,我们能不能不这么麻烦呢?可以
    //  a.创建实现类,实现接口
    //  b.重写方法
    //  c.创建实现类对象
    //  d.调用方法
    //
    //2.如果就想单纯的使用一下接口中的方法,我们就没必要经过以上四步了,我们可以四合一
    //
    //3.匿名内部类怎么学:就按照一种格式来学,这一种格式就代表了实现类对象或者子类对象
    //
    //4.格式:
    //  new 接口/抽象类(){
    //      重写方法
    //  }.重写的方法();
    //
    //  =================================
    //
    //  类名 对象名 = new 接口/抽象类(){
    //      重写方法
    //  }
    //  对象名.重写的方法();

    public static void main(String[] args) {
        new USB(){
            @Override
            public void open(){
                System.out.println("鼠标打开");
            }

            @Override
            public void close(){
                System.out.println("鼠标关闭");
            }
        }.close();

        System.out.println("=====================");

        USBA usba = new USBA(){
            @Override
            public void look(){
                System.out.println("看看这是什么");
            }
            @Override
            public void site(){
                System.out.println("做下来");
            }
        };//细节注意冒号
        usba.look();
        usba.site();
    }
}
