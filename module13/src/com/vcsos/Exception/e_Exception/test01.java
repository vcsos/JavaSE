package com.vcsos.Exception.e_Exception;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) throws LoginUserException {
        String username="root";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals(username)){
            System.out.println("登录成功");
        }else{
            try{
                throw new LoginUserException("登录失败,用户账号或者密码有问题");
            }catch (Exception e){
                //Throwable类中的方法:
                //  String toString()  :输出异常类型和设置的异常信息
                //  String getMessage(): 输出设置的异常信息
                //  void printStackTrace():打印异常信息是最全的:包括异常类型,信息,以及出现的行数等
               // System.out.println(e.toString());
                //System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }
}
