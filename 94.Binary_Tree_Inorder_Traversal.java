/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.empty()){
            if(root != null){
                stack.push(root);
                root = root.left;
            } 
            else{
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}
