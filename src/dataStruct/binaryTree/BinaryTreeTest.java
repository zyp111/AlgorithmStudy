package dataStruct.binaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int arr[] = {5,3,6,7,9,1,2};
        BinaryTreeNode node = new BinaryTreeNode();
        node.data = arr[0];
        node.lchild = null;
        node.rchild = null;
        binaryTree.setRoot(node);
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.data = arr[1];
        node1.lchild = null;
        node1.rchild = null;
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.data = arr[2];
        node2.lchild = null;
        node2.rchild = null;
        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.data = arr[3];
        node3.lchild = null;
        node3.rchild = null;
        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.data = arr[4];
        node4.lchild = null;
        node4.rchild = null;
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.data = arr[5];
        node5.lchild = null;
        node5.rchild = null;
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.data = arr[6];
        node6.lchild = null;
        node6.rchild = null;
        node.lchild = node1;
        node.rchild = node2;
        node1.lchild = node3;
        node1.rchild = node4;
        node2.lchild = node5;
        node2.rchild = node6;
//        binaryTree.preOrder(node);
//        binaryTree.preOrderAnother(node);
//        binaryTree.inOrder(node);
//        binaryTree.inOrderAnother(node);
//        binaryTree.postOrder(node);
//        binaryTree.postOrderAnother(node);
        binaryTree.bfs(node);
    }
}
