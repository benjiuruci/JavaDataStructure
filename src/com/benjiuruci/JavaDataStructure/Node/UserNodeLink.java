package com.benjiuruci.JavaDataStructure.Node;

import org.w3c.dom.Node;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/13 16:02
 */
public class UserNodeLink {

    public UserNode userNode;

    public void insert(UserNode userNode){
        UserNode temp = userNode;
        if (userNode != null){
            userNode.userNode = temp;
        }
        userNode = temp;
    }

}
