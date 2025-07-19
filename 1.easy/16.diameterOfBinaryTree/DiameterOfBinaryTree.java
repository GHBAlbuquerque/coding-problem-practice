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

public class DiameterOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int depth =1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        return depth;
    }


    public static int diameterOfBinaryTree(TreeNode root) {
        // 1. when I reach the end of a subtree then I have to start bubbling back, so I return 0
        if(root == null) {
            return 0;
        }

        // 2. I need to know the depth of each of my subtrees for my current node
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);

        // 3. This is the diameter of my current node
        int diameterRoot = leftDepth + rightDepth;
        // 4. Since the longest diameter might not go through my root, i have to check of both my subtrees
        int diameterLeft = diameterOfBinaryTree(root.left);
        int diameterRight = diameterOfBinaryTree(root.right);

        System.out.printf("Current node: %s\n", root.val);
        System.out.printf("diameterLeft: %s\n", diameterLeft);
        System.out.printf("diameterRight: %s\n",diameterRight);

        // 5. Have to return the biggest value
        return Math.max(diameterRoot, Math.max(diameterLeft, diameterRight));
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(3)
        );

        System.out.printf("Maximum Diameter of binary tree: %s\n", DiameterOfBinaryTree.diameterOfBinaryTree(root));


        TreeNode root2 = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(
                                4,
                                null,
                                new TreeNode(5)
                        )
                ),
                null
        );

        System.out.printf("Maximum Diameter of binary tree2: %s\n", DiameterOfBinaryTree.diameterOfBinaryTree(root2));


    }
}