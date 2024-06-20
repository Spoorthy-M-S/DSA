package DSA.BinaryTrees.S1Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q4ZigZagTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val= data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                temp.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            ans.add(new ArrayList(temp));
        }
        for (int i = 0; i < ans.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(46);
        root.left.right.left=new Node(8);
        root.left.right.right=new Node(880);
        System.out.println(zigzagLevelOrder(root));
        
    }}


