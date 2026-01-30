package com.vcsos.h_Collection_HashMapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo01CollectionHashMapIterator {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("张三", 25);
        hashMap.put("李四", 30);
        hashMap.put("王五", 28);
        hashMap.put("赵六", 35);

        System.out.println("=== 使用keySet()迭代器遍历键 ===");
        Iterator<String> keyIterator = hashMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
