package DSA.BinaryTrees.S1Easy;

import java.util.*;

public class Q1BuildTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int arr[]) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void level(Node root) {
            if (root == null) {
                System.out.println("EMPTY");
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.poll();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    }
                    System.out.println();
                    q.add(null);
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree r = new BinaryTree();

        Node root = r.buildTree(arr);
        r.level(root);

    }

}
