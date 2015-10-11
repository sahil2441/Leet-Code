import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderUsingStack {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		List<Integer> integers = inorderTraversal(root);
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}

	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		TreeNode currentNode = root;
		while (!stack.empty()) {

			currentNode = stack.peek();
			while (currentNode.left != null) {
				stack.push(currentNode.left);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			list.add(currentNode.val);

			while (currentNode.right == null && !stack.empty()) {
				currentNode = stack.pop();
				list.add(currentNode.val);
			}
			if (currentNode.right != null) {
				stack.push(currentNode.right);
			}
		}
		return list;

	}
}
