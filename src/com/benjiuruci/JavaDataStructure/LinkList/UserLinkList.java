package com.benjiuruci.JavaDataStructure.LinkList;

/**
 * 对user链表数据进行操作
 * @Author: qinxianzhong
 * @Date: 2022/5/14 9:54
 */
public class UserLinkList {

    private UserLink first;

    /**
     * 插入数据
     * @param name
     * @param address
     * @param age
     */
    public void insertFirst(String name,String address,int age){
        UserLink current = new UserLink(name,address,age);
        current.next = first;
        first = current;
    }

    /**
     * 根据姓名查找user实体类数据
     * @param name
     * @return
     */
    public User findKeyName(String name){
        UserLink current = first;
        while (current != null && !current.user.getName().equals(name)){
            current = current.next;
        }
        if (current == null){
            return null;
        }
        return current.user;
    }


    public User deleteKeyName(String name){
        UserLink current = first;
        UserLink previous  = first;
        while (!current.user.getName().equals(name)){
            previous = current;
            current = current.next;

            if (current == null){
                return null;
            }
        }

        if (current == first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current.user;
    }

    /**
     * 删除头部数据
     */
    public void deleteFirst(){
        UserLink current = first;
        current = first.next;
        first = current;
    }


    /**
     * 循环遍历
     */
    public void displayLinkList(){
        UserLink current = first;
        while (current != null){
            current.display();
            current = current.next;
        }

    }

}
