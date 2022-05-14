package com.benjiuruci.JavaDataStructure.LinkList;

/**
 * 用户实体类
 * @Author: qinxianzhong
 * @Date: 2022/5/14 9:39
 */
public class User {

    private String name;
    private String address;
    private int age;

    public User(String name,String address,int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "name:" + name + " age:" + age + " address:" + address;
    }


}
