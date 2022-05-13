package com.benjiuruci.JavaDataStructure.Node;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/13 15:56
 */
public class User {

    private String name;

    private int age;

    private String address;

    public User(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "name:" + name + " age:" + age + " address:" + address;
    }

}
