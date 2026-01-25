package com.vcsos.Extends.m_abstract;

public class JavaEE extends Developer{
    @Override
    public void work(){
        System.out.println("员工号为:"+this.getId()+"的"+this.getName()+"正在开发网站");
    }
}
