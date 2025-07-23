class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BalancedBinaryTree {

    private static int checkDepth(TreeNode node) {
        if(node == null) {
            return 0; //base case
        }

        int leftDepth = checkDepth(node.left);
        if(leftDepth == -1) return -1; // if left in unbalanced, return -1

        int rightDepth = checkDepth(node.right);
        if(rightDepth == -1) return -1; // if right is unbalanced, return -1

        if(Math.abs(leftDepth - rightDepth) > 1) return -1; //if in this node they become unbalanced, return -1

        return 1 + Math.max(leftDepth, rightDepth); //otherwise return max depth
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }

        int depth = checkDepth(root);

        if (depth == -1) return false;

        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        BalancedBinaryTree.isBalanced(root);
    }
}