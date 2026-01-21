package com.vcsos.method;

public class Demo01a_Method {
//1.问题描述:
//    之前所有的代码都在main方法中写,如果我们将来将所有功能的代码都放到main方法中,会显得main方法代码太多,太乱,太臃肿-> 不好维护
//
//    解决:将不同功能的代码放到不同的方法中,想执行某个功能,直接调用方法名就行了,对应的代码就自动执行起来了
//            将来维护的时候,直接找到对应的方法,就可以对其直接修改维护
//
//2.方法:
//    拥有功能性代码的代码块
//            将不同的功能放在不同的方法中,给每个方法取个名字,直接调用方法名,对应的方法就执行起来了,好维护
//
//3.通用定义格式:
//    修饰符 返回值类型 方法名(参数){
//        方法体
//        return 结果
//    }
//
//4.通过通用格式,分成四种方法来学习:
//    a.无参无返回值方法
//    b.有参无返回值方法
//    c.无参有返回值方法
//    d.有参有返回值方法
public static void main(String[] args) {
    cooker();
}

    //1.无参无返回值方法
    public static void cooker(){
        System.out.println("炒菜");
        System.out.println("烧水");
        System.out.println("做饭");
    }
}
