package com.benjiuruci.JavaDataStructure.DoubleLinkList;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/15 15:44
 */
public class SchoolLinkListMain {
    public static void main(String[] args) {
        SchoolLinkList schoolLinkList = new SchoolLinkList();
        schoolLinkList.insertFirst("长江小学","北京","小学");
        schoolLinkList.insertFirst("二中","上海","初中");
        schoolLinkList.insertLast("三中","武汉","高中");
        schoolLinkList.insertLast("科技大学","武汉","大学");
        schoolLinkList.insertFirst("益智幼儿园","武汉","幼儿园");

        schoolLinkList.displayLink();

        schoolLinkList.deleteKeyName("科技大学");
        schoolLinkList.displayLink();
    }
}
