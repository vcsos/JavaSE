package com.vcsos.ClassStudy.d_innerclass;

import org.w3c.dom.ls.LSOutput;

public class Person {
    /*
1.格式:直接在定义内部类的时候加上static关键字
  public class A{
      static class B{

      }
  }
2.注意:
  a.内部类可以定义属性,方法,构造等
  b.静态内部类可以被final或者abstract修饰
    被final修饰之后,不能被继承
    被abstract修饰之后,不能new
  c.静态内部类不能调用外部的非静态成员
  d.内部类还可以被四种权限修饰符修饰

3.调用静态内部类成员:
  外部类.内部类 对象名 = new 外部类.内部类()
* */
    static class Heart{
        public void method01(){
            System.out.println("心脏功能正常");
        }
    }
}
