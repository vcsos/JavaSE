package com.vcsos.staticLearn.e_ArrObject;

public class testStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];
         students[0] = new Student("张三",92.5);
        students[1] = new Student("李四",30.5);
        students[2] = new Student("王二",70.7);


        //这个是冒泡排序
        for (int j = 0; j < students.length-1; j++) {
            for (int i = 0; i < students.length-1-j; i++) {
                if (students[i].getScore()>students[i+1].getScore()) {
                    Student temp=students[i];  //拿到的是student对象,那么temp接受的也是student对象
                    students[i]=students[i+1];
                    students[i+1]=temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"==="+students[i].getScore());
        }
    }
}
