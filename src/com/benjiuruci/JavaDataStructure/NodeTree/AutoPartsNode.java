package com.benjiuruci.JavaDataStructure.NodeTree;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/18 22:35
 */
public class AutoPartsNode {
    public AutoParts autoParts;
    public AutoPartsNode leftChild;
    public AutoPartsNode rightChild;


    public AutoPartsNode(AutoParts autoParts){
        this.autoParts = autoParts;

    }

    public void display(){
        System.out.println(autoParts);
    }


}
