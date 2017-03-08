/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.empty()){
            if(root != null){
                stack.push(root.right);
                root = root.left;
                if(root != null && root.left == null && root.right == null){
                    sum += root.val;
                    root = stack.pop();
                } 
            }
            else root = stack.pop();
        }
        return sum;
    }
}
