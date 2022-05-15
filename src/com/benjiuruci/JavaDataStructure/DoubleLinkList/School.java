package com.benjiuruci.JavaDataStructure.DoubleLinkList;

/**
 * 学校实体类数据
 * @Author: qinxianzhong
 * @Date: 2022/5/15 15:09
 */
public class School {
    private String name;
    private String address;
    private String type;

    public School(String name,String address,String type){
        this.name = name;
        this.address = address;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "name:" + name + " address:" + address + " type:" + type;
    }

}
