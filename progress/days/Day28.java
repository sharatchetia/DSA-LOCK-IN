// BINARY SEARCH TREE LEET 700


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
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val){
            return root;
        }

        if(val < root.val){
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);

    }
}




// LEETCODE 701

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
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}


// MIN VAL BST
TreeNode min(TreeNode root) {

    while (root.left != null) {
        root = root.left;
    }

    return root;
}


//MAX VAL BST
TreeNode max(TreeNode root) {

    while (root.right != null) {
        root = root.right;
    }

    return root;
}





//INORDER SUCCESSOR
TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

    // Case 1: Right subtree exists
    if (p.right != null) {
        return min(p.right);
    }

    // Case 2: No right subtree
    TreeNode successor = null;

    while (root != null) {

        if (p.val < root.val) {
            successor = root;
            root = root.left;
        } else if (p.val > root.val) {
            root = root.right;
        } else {
            break;
        }
    }

    return successor;
}




// INORDER PREDECESSOR

TreeNode inorderPredecessor(TreeNode root, TreeNode p) {

    // Case 1: Left subtree exists
    if (p.left != null) {
        return max(p.left);
    }

    // Case 2: No left subtree
    TreeNode predecessor = null;

    while (root != null) {

        if (p.val > root.val) {
            predecessor = root;
            root = root.right;
        } else if (p.val < root.val) {
            root = root.left;
        } else {
            break;
        }
    }

    return predecessor;
}