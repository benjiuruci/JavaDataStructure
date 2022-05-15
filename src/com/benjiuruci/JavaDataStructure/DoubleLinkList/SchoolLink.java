package com.benjiuruci.JavaDataStructure.DoubleLinkList;

/**
 * 学校实体类链表
 * @Author: qinxianzhong
 * @Date: 2022/5/15 15:21
 */
public class SchoolLink {
    public School school;
    public SchoolLink next;

    public SchoolLink(String name,String address,String type){
        School school = new School(name,address,type);
        this.school = school;
    }

    public void display(){
        System.out.println(school);
    }

}
