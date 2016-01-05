
public class PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		System.out.println(hasPathSum(root, 1));

	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null) {
			return sum - root.val == 0;
		}
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

	}

}
