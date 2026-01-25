package com.vcsos.Extends.m_abstract;


public class test01 {
    public static void main(String[] args) {
        Android android = new Android();
        android.setId(1);
        android.setName("涛哥");
        android.work();

        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("涛哥");
        javaEE.work();

        Network network = new Network();
        network.setId(1);
        network.setName("涛哥");
        network.work();

        Hardware hardware = new Hardware();
        hardware.setId(1);
        hardware.setName("涛哥");
        hardware.work();
    }
}
