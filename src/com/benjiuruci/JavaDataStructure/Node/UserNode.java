package com.benjiuruci.JavaDataStructure.Node;

/**
 * 1
 * @Author: qinxianzhong
 * @Date: 2022/5/13 15:58
 */
public class UserNode {
    public User user;
    public UserNode userNode;

    public UserNode(User user){
        this.user = user;
    }


    public void display(){
        System.out.println(user);
    }


}
