// import java.util.*;

// public class Day24 {

//     // ================= Node =================
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // ================= Binary Tree =================
//     static class BinaryTree {

//         Node root;

//         BinaryTree() {

//             // Create nodes
//             root = new Node(1);
//             Node second = new Node(2);
//             Node third = new Node(3);
//             Node fourth = new Node(4);
//             Node fifth = new Node(5);

//             // Connect them
//             root.left = second;
//             root.right = third;

//             second.left = fourth;
//             second.right = fifth;
//         }
//     }

//     // ================= Main =================
//     public static void main(String[] args) {

//         BinaryTree tree = new BinaryTree();

//     }
// }


import java.util.*;

public class Day24 {

    // ================= Node =================
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

    // ================= Binary Tree =================
    static class BinaryTree {
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);

            newNode.right = buildTree(nodes);

            return newNode;
        }

        
    }

    // ================= Main =================
    public static void main(String[] args) {

        int nodes[] = {
            1,
            2,
            4,
            -1,
            -1,
            5,
            -1,
            -1,
            3,
            -1,
            -1
        };

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

    }
}






/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
    
//     public int maxDepth(TreeNode root) {
//         if(root == null){
//             return 0;
//         }

//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);

//         int answer = 1+Math.max(left, right);

//         return answer;
//     }
// }