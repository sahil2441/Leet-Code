/**
 * Populate each next pointer to point to its next right node. If there is no
 * next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * @author sahiljain
 *
 */
public class NextRightPointers {

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(10);
		root.left = new TreeLinkNode(5);
		root.right = new TreeLinkNode(15);

		connect(root);
		System.out.println(root.left.next.val);

	}

	public static void connect(TreeLinkNode root) {

		if (root == null) {
			return;
		}

		int indexAdd = -1;
		int indexRetrieve = 0;
		int size = getSize(root);
		TreeLinkNode[] array = new TreeLinkNode[size];
		array[++indexAdd] = root;

		while (indexAdd + 1 < size) {
			TreeLinkNode node = array[indexRetrieve];
			array[++indexAdd] = node.left;
			array[++indexAdd] = node.right;

			if (isPowerOfTwo(indexRetrieve + 2)) {
				array[indexRetrieve].next = null;
			} else {
				array[indexRetrieve].next = array[indexRetrieve + 1];
			}
			indexRetrieve++;
		}

		while (indexRetrieve + 1 < size) {
			if (isPowerOfTwo(indexRetrieve + 2)) {
				array[indexRetrieve].next = null;
			} else {
				array[indexRetrieve].next = array[indexRetrieve + 1];
			}
			indexRetrieve++;
		}

	}

	public static int getSize(TreeLinkNode node) {
		if (node == null) {
			return 0;
		}
		return getSize(node.left) + getSize(node.right) + 1;
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 2) {
			return true;
		}
		if (n % 2 == 1) {
			return false;
		}
		return isPowerOfTwo(n / 2);
	}
}