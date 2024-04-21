package demo;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDemo {
    public static class Node{
        int data; 
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int[] nodes){
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root ){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node c = q.remove();
            if (c == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(c.data+" ");
                if (c.left != null) {
                    q.add(c.left);
                } 
                if (c.right != null) {
                  q.add(c.right);  
                }               
            }
        }
    }

    public static int countNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNode  = countNodes(root.left);
        int rightNode  =  countNodes(root.right);
        return leftNode+rightNode+1;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        levelOrder(root);

        System.out.println(countNodes(root));


    }
}
