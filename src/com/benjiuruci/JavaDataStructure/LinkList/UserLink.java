package com.benjiuruci.JavaDataStructure.LinkList;

/**
 * 用户链表
 * @Author: qinxianzhong
 * @Date: 2022/5/14 9:51
 */
public class UserLink {
    public User user;
    public UserLink next;

    public UserLink(String name,String address,int age){
        User temp = new User(name,address,age);
        this.user = temp;
    }

    public void display(){
        System.out.println(user.toString());
    }


}
