package com.benjiuruci.JavaDataStructure.Node;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/13 16:04
 */
public class test {

    public static void main(String[] args) {
        UserNodeLink userNodeLink = new UserNodeLink();
        UserNode userNode = new UserNode(new User("q",12,"青岛"));
        UserNode userNode1 = new UserNode(new User("q",12,"青岛"));
        UserNode userNode2 = new UserNode(new User("q",12,"青岛"));
        userNodeLink.insert(userNode);
        userNodeLink.insert(userNode1);
        userNodeLink.insert(userNode1);
    }

}

