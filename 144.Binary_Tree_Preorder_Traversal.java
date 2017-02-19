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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while(root != null || !stack.empty()){
            while(root != null){
                res.add(root.val);
                stack.push(root.right);
                root = root.left;
            }
            root = stack.pop();
        }
        return res;
    }
}
