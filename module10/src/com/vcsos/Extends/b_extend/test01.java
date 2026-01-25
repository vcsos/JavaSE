package com.vcsos.Extends.b_extend;

/*
总结:看等号左边是谁,先调用谁中的成员
    如果等号左边是父类类型,只能调用父类中的成员变量,如果等号左边是子类类型,既能调用子类的,还能调用父类中继承过来的非私有成员
*/
public class test01 {
    public static void main(String[] args) {
        //创建父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu);//父类中的numFu
        //System.out.println(fu.numZi);//不能直接调用子类特有的成员

        System.out.println("=================");
        //创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);//继承了父类,可以使用父类中非私有成员
    }
}
