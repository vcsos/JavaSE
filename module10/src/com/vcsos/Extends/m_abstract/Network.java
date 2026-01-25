package com.vcsos.Extends.m_abstract;

public class Network extends Maintainer{
    @Override
    public void work(){
        System.out.println("员工号为:"+this.getId()+"的"+this.getName()+"正在检查网络是否畅通");
    }
}
