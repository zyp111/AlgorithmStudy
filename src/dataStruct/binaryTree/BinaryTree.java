package dataStruct.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private BinaryTreeNode root;
    public BinaryTree() {
        root = null;
    }
    public void setRoot(BinaryTreeNode node) {
        root = node;
    }
    public BinaryTreeNode getRoot() {
        return root;
    }
    public void preOrder(BinaryTreeNode node) {  //先序遍历递归实现
        if(node != null) {
            System.out.println(node.data);
            preOrder(node.lchild);
            preOrder(node.rchild);
        }
    }
    public void inOrder(BinaryTreeNode node) {  //中序遍历递归实现
        if(node != null) {
            inOrder(node.lchild);
            System.out.println(node.data);
            inOrder(node.rchild);
        }
    }
    public void postOrder(BinaryTreeNode node) {  //中序遍历递归实现
        if(node != null) {
            postOrder(node.lchild);
            postOrder(node.rchild);
            System.out.println(node.data);
        }
    }
    public void preOrderAnother(BinaryTreeNode node) {  //先序遍历递推实现
        Stack<BinaryTreeNode> nodeStack = new Stack<>();
        nodeStack.push(node);
        while(!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            System.out.println(node.data);
            if(node.rchild != null)
                nodeStack.push(node.rchild);
            if(node.lchild != null)
                nodeStack.push(node.lchild);
        }
    }
    public void inOrderAnother(BinaryTreeNode node) { //中序遍历递推实现
        Stack<BinaryTreeNode> nodeStack = new Stack<>();
        nodeStack.push(node);
        while(!nodeStack.isEmpty()) {
            if(node.lchild != null) {
                nodeStack.push(node.lchild);
                node = node.lchild;
            } else {
                node = nodeStack.pop();
                System.out.println(node.data);
                if(node.rchild != null) {
                    nodeStack.push(node.rchild);
                    node = node.rchild;
                }
            }

        }
    }
    public void postOrderAnother(BinaryTreeNode node) { //后续遍历递推实现
        Stack<BinaryTreeNode> temp = new Stack<>();
        Stack<BinaryTreeNode> nodeStack = new Stack<>();
        temp.push(node);
        while(!temp.isEmpty()) {
            node = temp.pop();
            nodeStack.push(node);
            if(node.lchild != null)
                temp.push(node.lchild);
            if(node.rchild != null)
                temp.push(node.rchild);
        }
        while(!nodeStack.isEmpty()) {
            System.out.println(nodeStack.pop().data);
        }
    }
    public void bfs(BinaryTreeNode node) {  //递推实现广度优先遍历
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            node = queue.poll();
            System.out.println(node.data);
            if(node.lchild != null)
                queue.add(node.lchild);
            if(node.rchild != null)
                queue.add(node.rchild);
        }
    }
}
