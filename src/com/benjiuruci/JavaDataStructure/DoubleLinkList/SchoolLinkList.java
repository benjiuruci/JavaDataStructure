package com.benjiuruci.JavaDataStructure.DoubleLinkList;

/**
 * 学校实体类链表操作方法
 * @Author: qinxianzhong
 * @Date: 2022/5/15 15:30
 */
public class SchoolLinkList {
    private SchoolLink first;
    private SchoolLink last;


    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(String name,String address,String type){
        SchoolLink schoolLink = new SchoolLink(name,address,type);
        if (isEmpty()){
            last = schoolLink;
        }
        schoolLink.next = first;
        first = schoolLink;
    }

    public void insertLast(String name,String address,String type){
        SchoolLink schoolLink = new SchoolLink(name,address,type);
        if (isEmpty()){
            first = schoolLink;
        }else{
            last.next = schoolLink;
        }
        last = schoolLink;
    }

    public School deleteKeyName(String name){
        SchoolLink current = first;
        SchoolLink previous = first;
        while (!current.school.getName().equals(name)){
            previous = current;
            current = current.next;
            if (current == null){
                return null;
            }
        }
        if (current == first){
            first = first.next;
        }else{
            if (current == last){
                last = previous;
            }
            previous.next = current.next;
        }
        return current.school;
    }



    public void displayLink(){
        SchoolLink current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
    }


}
