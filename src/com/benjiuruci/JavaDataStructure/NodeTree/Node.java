package com.benjiuruci.JavaDataStructure.NodeTree;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/19 22:25
 */
public class Node {
    public int id;
    public String name;
    public Node left;
    public Node right;

    public void display(){
        System.out.println("id:" + id +" name:" + name );
    }

    @Override
    public String toString(){
        return "id:" + id +" name:" + name;
    }

}
