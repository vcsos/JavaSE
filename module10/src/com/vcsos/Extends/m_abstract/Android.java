package com.vcsos.Extends.m_abstract;

public class Android extends Developer{
    @Override
    public void work(){
        System.out.println("员工号为:"+this.getId()+"的"+this.getName()+"正在研发电商的手机客户端软件");
    }
}
