package com.benjiuruci.JavaDataStructure.LinkList;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/14 11:21
 */
public class t {
    public static void main(String[] args) {
        User user = new User("q","x",22);
        System.out.println(user);
        User user1 = user;
        System.out.println(user1);
        user1 = new User("v","v",22);
        System.out.println(user);
        System.out.println(user1);
    }
}
