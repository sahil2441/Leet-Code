package leetcode;

public class InvertTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		invertTree(root);

	}

	public static TreeNode invertTree(TreeNode root) {

		if (root == null)
			return null;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);
		return root;

	}
}
