package com.vcsos.Interface.a_interface;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public String close() {
        return "gaunbi";
    }
}
