package BinaryTree;
import java.util.*;

public class BinaryT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree{
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void postorder(Node root){
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void levelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    static int heightofTree(Node root){
        if (root == null) {
            return 0;
        }
        int heightleft = heightofTree(root.left);
        int heightright = heightofTree(root.right);

        int totalHeight = Math.max(heightleft, heightright) + 1;

        return totalHeight;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree t1 = new BTree();
        Node root = t1.BuildTree(nodes);
        // System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(countOfNodes(root));
        System.out.println();
        System.out.print(sumOfNodes(root));
        System.out.println();
        System.out.print(heightofTree(root));
        
    }
    
}
