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
    int max = 0;
    public int maxDepth(TreeNode root) {
        maxDepth(root, 0);    
        return max;
    }
    
    private void maxDepth(TreeNode root, int depth){
        if(root != null){
            depth++;
            max = Math.max(max, depth);
            maxDepth(root.left, depth);
            maxDepth(root.right, depth);
        }
        return;
    }
}


