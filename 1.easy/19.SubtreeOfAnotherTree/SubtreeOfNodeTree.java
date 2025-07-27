class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class SubtreeOfNodeTree {

    private static boolean isSameTree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;

        return isSameTree(root.left, subRoot.left) &&
                isSameTree(root.right, subRoot.right);
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true; // a null subtree is a subtree of any tree
        if(root == null) return false; // there is no subtree to check.
        // but if both are null, it's equal, so subtree == null vhas to be checked first

        if(isSameTree(root, subRoot)) return true;

        return isSubtree(root.right, subRoot) ||
                isSubtree(root.left, subRoot);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2)
                ),
                new TreeNode(5)
        );

        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2)
        );

        System.out.println(SubtreeOfNodeTree.isSubtree(root, subRoot));
    }
}