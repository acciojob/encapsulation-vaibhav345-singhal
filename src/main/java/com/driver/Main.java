package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "available";
//        System.out.println(obj.name);
        //Error: name has private access in com.driver.RWOnly

        obj.setter("available");

        System.out.println(obj.getter());
    }
}