package com.benjiuruci.JavaDataStructure.NodeTree;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/19 22:39
 */
public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50,"秦献忠");
        tree.insert(75,"刘世杰");
        tree.insert(62,"陈迦勒");
        tree.insert(87,"张宇");
        tree.insert(93,"李四");
        /*tree.insert(70,"诸葛");*/
        /*tree.insert(55,"后继");*/

        /*System.out.println(tree.findKey(40));*/


        System.out.println("查找最小值-->");
        System.out.println(tree.minmum());
        System.out.println("查找最大值-->");
        System.out.println(tree.maxmum());
        System.out.println("遍历--->");
        tree.displayNode(tree.getRoot());
        tree.deleteKey(75);
        System.out.println("遍历--->");
        tree.displayNode(tree.getRoot());


    }
}
