package com.benjiuruci.JavaDataStructure.LinkList;

/**
 * main方法测试
 * @Author: qinxianzhong
 * @Date: 2022/5/14 9:58
 */
public class UserLinkListMain {

    public static void main(String[] args) {
        UserLinkList userLinkList = new UserLinkList();

        userLinkList.insertFirst("秦","青岛",22);
        userLinkList.insertFirst("刘","石家庄",22);
        userLinkList.insertFirst("陈","石家庄",21);
        userLinkList.insertFirst("张","石家庄",23);

        System.out.println("遍历数据----------->");
        userLinkList.displayLinkList();

        System.out.println("根据姓名查询数据----------->");
        System.out.println(userLinkList.findKeyName("张"));

        userLinkList.deleteKeyName("张");

        System.out.println("删除之后再次遍历");
        userLinkList.displayLinkList();

    }
}
