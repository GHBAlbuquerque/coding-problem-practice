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

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        // 1. when I reach the end of a subtree then I have to start bubbling back, so I return 0
        if(root == null) {
            return 0;
        }

        int depth =1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        // 1 is for the node i'm current in, and I add the result for every layer I run
        // I choose between the subtrees for each node I check
        // could check separately, but it would be less efficient (deepLeft = 1+(maxDepth(root.left));

        System.out.printf("Current node: %s\n", root.val);
        System.out.printf("depth: %s\n", depth);

        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        System.out.printf("Max depth: %s\n", MaximumDepthOfBinaryTree.maxDepth(root));

        TreeNode root2 = new TreeNode(
                3,
                new TreeNode(
                        9,
                        new TreeNode(15),
                        new TreeNode(7)
                ),
                new TreeNode(20)
        );


        System.out.printf("Max depth 2: %s\n", MaximumDepthOfBinaryTree.maxDepth(root2));
    }
}