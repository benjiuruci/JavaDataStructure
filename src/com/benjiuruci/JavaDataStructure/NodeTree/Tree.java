package com.benjiuruci.JavaDataStructure.NodeTree;

/**
 * @Author: qinxianzhong
 * @Date: 2022/5/19 22:26
 */
public class Tree {
    private Node root;


    /**
     * 查找关键字
     * @param id
     * @return
     */
    public Node findKey(int id){
        Node current = root;
        if (root == null){
            return null;
        }else{
            while (current.id != id){
                if (id < current.id){
                    current = current.left;
                }else{
                    current = current.right;
                }

                if (current == null){
                    return null;
                }
            }
        }
        return current;
    }

    /**
     * 添加
     * @param id
     * @param name
     */
    public void insert(int id,String name){
        Node newNode = new Node();
        newNode.id = id;
        newNode.name = name;
        if (root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if (id < current.id){
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if (current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 查找最小值
     * @return
     */
    public Node minmum(){
        Node current = root;
        Node last = root;
        while (current != null){
            last = current;
            current = current.left;
        }
        return last;
    }

    /**
     * 查找最大值
     * @return
     */
    public Node maxmum(){
        Node current = root;
        Node last = root;
        while (current != null){
            last = current;
            current = current.right;
        }
        return last;
    }


    public boolean deleteKey(int keyId){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.id != keyId){
            parent = current;
            if (keyId < current.id){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if (current == null){
                return false;
            }
        }
        if (current.left == null && current.right == null ){
            if (current == root){
                root = null;
            }else if (isLeftChild){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }else if(current.right == null){
            if (current == root){
                root = current.left;
            }else if (isLeftChild){
                parent.left = current.left;
            }else{
                parent.right = current.right;
            }
        }else if (current.left == null){
            if (current == root){
                root = current.right;
            }else if (isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        }else{
            Node successor = getSuccessor(current);
            if (current == root){
                root = successor;
            }else if (isLeftChild){
                parent.left = successor;
            }else{
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    /**
     * 查找后继节点
     * @param delNode
     * @return
     */
    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;
        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != delNode.right){
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    /**
     * 中序遍历
     * @param localNode
     */
    public void displayNode(Node localNode){
        if (localNode != null){
            displayNode(localNode.left);
            localNode.display();
            displayNode(localNode.right);
        }
    }

    public Node getRoot(){
        return root;
    }


}
