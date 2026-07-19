import java.util.*;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
        return true;
        }
        if (p == null && q != null){
            return false;
        }
        if (p != null && q == null){
            return false;
        }

        if (p.val!=q.val){
            return false;
        }
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);

        if(left && right){
            return true;
        }

        return false;

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
class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean left = isMirror(p.left, q.right);
        boolean right = isMirror(p.right, q.left);

        return left && right;
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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> result = new LinkedList<>();
        preorder(root, result);
        return result;
    }
    private void preorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }

        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorder(root, result);
        return result;
    }
    private void inorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        postorder(root, result);
        return result;
    }
    private void postorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }

        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
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
class Solution3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Queue <TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelCount = queue.size();
            List<Integer> level = new LinkedList<>();

            for(int i=0; i<levelCount; i++){
                
                TreeNode current = queue.poll();
                level.add(current.val);
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }

            result.add(level);
        }
        return result;
    }
}