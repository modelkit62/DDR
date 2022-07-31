package three1_MaximumDepthofBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

public class App {

    public static int maxDepth(TreeNode root) {
        // return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        if (root == null) return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return 1 + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.right.left.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        root.right.left.left.right = new TreeNode(10);

        System.out.println(maxDepth(root));
    }

}