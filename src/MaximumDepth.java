

public class MaximumDepth {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(20);
		root.right=new TreeNode(30);
		System.out.println(maxDepth(root));
	}
    public static int maxDepth(TreeNode root) {
    	if(root==null)return 0;    	
    	return Math.max(maxDepth(root.left),maxDepth(root.right))+1;  
    }
}
