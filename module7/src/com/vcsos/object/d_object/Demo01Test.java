package com.vcsos.object.d_object;

public class Demo01Test {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name="张万达";
        citizen.idCard="91243";
        citizen.birthday.year=2000;
        citizen.birthday.month=10;
        citizen.birthday.day=21;
        System.out.println(citizen.name);
        System.out.println(citizen.birthday.day);
    }
}
