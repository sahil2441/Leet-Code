package leetcode;
/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of
 * two given nodes in the BST.
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor
 * is defined between two nodes v and w as the lowest node in T that has both v
 * and w as descendants (where we allow a node to be a descendant of itself).”
 * 
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class LowestCommonAncestor {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		while (root != null) {

			if (root.val > p.val && root.val > q.val) {
				root = root.left;
			} else if (root.val < p.val && root.val < q.val) {
				root = root.right;
			} else {
				break;
			}
		}
		return root == null ? null : root;
	}
}