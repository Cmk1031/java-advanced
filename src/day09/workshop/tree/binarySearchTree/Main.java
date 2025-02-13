package day09.workshop.tree.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(6);

        System.out.println(myTree.head.value);
        System.out.println(myTree.head.left.value);
        System.out.println(myTree.head.left.left.value);
        System.out.println(myTree.head.right.right.left.right.value);

    }

}
