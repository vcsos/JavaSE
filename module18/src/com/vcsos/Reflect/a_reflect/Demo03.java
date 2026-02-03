package com.vcsos.Reflect.a_reflect;

import lombok.Data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        //构造方法对象
        Class empClass = Emp.class;
        Constructor declaredConstructor = empClass.getDeclaredConstructor();
        //构建对象
        Object emp = declaredConstructor.newInstance();

        //获取对象属性
        Field account = empClass.getField("account");
        Field password = empClass.getField("password");
        //给属性赋值
        account.set(emp,"张三");
        password.set(emp,"zhangsan");

        //获取登录
        Method login = empClass.getMethod("login");
        //调用方法
        Object invoke = login.invoke(emp);
        System.out.println(invoke);

    }
}
@Data
class Emp{
    public String account;
    public String password;
    public  boolean login(){
        if ("admin".equals(account)&& "admin".equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
