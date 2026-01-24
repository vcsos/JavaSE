package com.vcsos.staticLearn.e_ArrObject;

public class test01 {
    public static void main(String[] args) {
        //对象数组的创建
        Person[] arr = new Person[3];

        Person p1 = new Person("将来",18);
        Person p2 = new Person("未来",20);
        Person p3 = new Person("张三",100);

        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;

        for (int i = 0; i < arr.length; i++) {
            //Person p = arr[i];
            System.out.println(arr[i].getName()+"==="+arr[i].getAge());
        }
    }
}
