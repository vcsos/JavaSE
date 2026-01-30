package com.vcsos.d_Collection_HashSet;

import java.util.HashSet;

public class Demo01CollectionHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        //通过散列算法 (哈希算法)构成无序,存储不重复的集合
        hashSet.add("消炎");
        hashSet.add("王玲");
        hashSet.add("网络");
        hashSet.add("炎尊");

        //删除数据
        hashSet.remove("网络");
        //查询数据用for
        for (Object obj :hashSet){
            System.out.println(obj);
        }
    }
        //方法通用
}
