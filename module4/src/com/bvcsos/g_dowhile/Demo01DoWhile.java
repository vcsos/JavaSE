package com.bvcsos.g_dowhile;

public class Demo01DoWhile {
    public static void main(String[] args) {
        int i=0;
        do {
            System.out.println("菜单");
            System.out.println("1.选择");
            System.out.println("2.退出");
            i++;
        }while(i<3);
    }
}
