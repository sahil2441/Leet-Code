/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
    
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        
        int heightLeft=height(node.left);
        int heightRight=height(node.right);
        
        if(heightLeft==-1) return -1;
        if(heightRight==-1) return -1;
        
        if (Math.abs(heightLeft- heightRight)>1){
            return -1;
        }
        return Math.max(heightLeft,heightRight) +1;
    }
}