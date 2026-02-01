package com.vcsos.IO.d_IO;

import java.io.*;

public class Demo01 {
    public static void main(String[] args){
        //1.创建数据文件对象
        File datafile = new File("E:\\JavaCode\\javase\\module16\\src\\com\\vcsos\\IO\\data\\obj.dat");
       //2.对象输出流(管道对象)
        ObjectOutputStream objectOut = null;
        FileOutputStream out = null;        //文件输出流

        //对象输入流
        ObjectInputStream objectIn =null;
        FileInputStream in = null;
        try {
//            out = new FileOutputStream(datafile);
//            objectOut = new ObjectOutputStream(out);
//            //只有增加了特殊标记的类才能在写文件中序列化
//            User user = new User();
//            objectOut.writeObject(user);
//            objectOut.flush();

            //TODO:从文件中读取数据转换成对象
            in=new FileInputStream(datafile);
            objectIn =new ObjectInputStream(in);
            Object o = objectIn.readObject();
            System.out.println(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if (objectOut!=null){
                try {
                    objectOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (objectIn!=null) {
                try {
                    objectIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class User implements Serializable{

}