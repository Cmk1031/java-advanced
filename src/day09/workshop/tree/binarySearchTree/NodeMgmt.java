package day09.workshop.tree.binarySearchTree;

/*
    1. Node 생성 -> Root
    2. BST에 데이터 넣는 기능 구현
 */
public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE1: Node가 하나도 없는 경우
        if (this.head == null) {
            this.head = new Node(data);

            // CASE2: Node가 하나 이상 들어가 있는 경우
        } else {
            Node findNode = this.head;
            while (true) {
                //CASE2-1 :  현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }

                    //CASE2-2 :  현재 Node의 오른쪽에 Node가 들어가야 할때

                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }

                }

            }

        }
        return true;
    }

    public Node search(int data) {
        //CASE1: Node가 하나도 없을때
        if (this.head == null) {
            return null;
        } else {
            //CASE2: Node가 하나 이상일 때
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (findNode.value > data) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
        }
        return null;
    }
    //노드 삭제 boolean delete(int data); 추가 팀 과제

    public boolean delete(int data) {
        //CASE1: 노드가 하나도 없는 경우
        if(this.head==null) return false;
        //CASE2: 삭제할 노드가 존재 하지 않는 경우
        else if(search(data)==null) return false;
        //CASE3: 삭제할 노드 존재! 찾아서 삭제
        else {
            //head
            Node findNode = this.head;
            while(findNode!=null) {
                if(findNode.value > data) {
                    findNode = findNode.left;
                } else if(findNode.value < data) {
                    findNode = findNode.right;
                } else {
                    //삭제할 노드가 leaf인 경우
                    if(findNode.left==null && findNode.right==null) {

                        //삭제할 노드가 왼쪽 노드만 보유!
                    } else if(findNode.left!=null && findNode.right==null) {
                        //삭제할 노드가 오른쪽 노드만 보유!
                    } else if(findNode.left==null && findNode.right!=null) {
                        //삭제할 노드가 왼쪽, 오른쪽 자식 노드 2개 보유
                    } else {

                    }
                }

            }

        }

        return false;
    }


}