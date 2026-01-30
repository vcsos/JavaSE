package com.vcsos.f_Collection_Map;

import java.util.*;

public class Demo01CollectionMap {
    public static void main(String[] args) {
        //无序存储
        HashMap<String,Integer> map = new HashMap<>();
        //添加数据1
        map.put("帝王",1);
        map.put("将军",3);
        System.out.println(map);
        map.put("诸侯",2);
        System.out.println(map);
        //添加数据2
        map.putIfAbsent("士大夫",4);//数据存在则不动集合,数据不存在则添加
        //修改数据3
        map.replace("b",4);
        //清除数据
//        map.clear();
        //查询数据
        System.out.println(map.get("帝王"));//获得的是值
        //删除数据remove
        //map.remove("赵政");
        //map.remove("祖龙","3");
        System.out.println("==========================");
        //获取集合中所有的键
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println("==========================");
        //获取集合中所有的值
        Collection<Integer> value = map.values();
        System.out.println(value);

        System.out.println("==========================");
        //获取所有的键值对
        Set set1 = map.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        System.out.println("==========================");
    }
}
