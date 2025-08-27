## Daily Coding Problem

**Given the root of a binary tree, invert the tree, and return its root.**

Example 1
```
Input:  root = [4,2,7,1,3,6,9]
Output:        [4,7,2,9,6,3,1]
```

```
Original:                 Inverted:
       4                       4
     /   \                   /   \
    2     7                7     2
   / \   / \              / \   / \
  1   3 6   9            9   6 3   1
```

Example 2:
```
Input:  root = [2,1,3]
Output:        [2,3,1]
```

```
Original:          Inverted:
     2                  2
    / \                / \
   1   3              3   1
```

Example 3:
```
Input:  root = []
Output:        []
```


Constraints:

* The number of nodes in the tree is in the range [0, 100].
* -100 <= V1.04.invertBinaryTree.com.easy.V1.com.easy._04invertBinaryTree.Node.val <= 100


--------------


```
javac V1.04.invertBinaryTree.com.easy.V1.com.easy._04invertBinaryTree.InvertBinaryTree.java && java V1.04.invertBinaryTree.com.easy.V1.com.easy._04invertBinaryTree.InvertBinaryTree
```

```
LeetCode:

class Solution {
    public 18.sameTree.com.easy.com.easy._15maximumDepthOfBinaryTree.com.easy._16diameterOfBinaryTree.com.easy._17balancedBinaryTree.com.easy._18sameTree.com.easy._19subtreeOfAnotherTree.TreeNode invertTree(18.sameTree.com.easy.com.easy._15maximumDepthOfBinaryTree.com.easy._16diameterOfBinaryTree.com.easy._17balancedBinaryTree.com.easy._18sameTree.com.easy._19subtreeOfAnotherTree.TreeNode root) {
        if (root == null) return root;

        18.sameTree.com.easy.com.easy._15maximumDepthOfBinaryTree.com.easy._16diameterOfBinaryTree.com.easy._17balancedBinaryTree.com.easy._18sameTree.com.easy._19subtreeOfAnotherTree.TreeNode invertedLeft = invertTree(root.left);
        18.sameTree.com.easy.com.easy._15maximumDepthOfBinaryTree.com.easy._16diameterOfBinaryTree.com.easy._17balancedBinaryTree.com.easy._18sameTree.com.easy._19subtreeOfAnotherTree.TreeNode invertedRight = invertTree(root.right);

        return new 18.sameTree.com.easy.com.easy._15maximumDepthOfBinaryTree.com.easy._16diameterOfBinaryTree.com.easy._17balancedBinaryTree.com.easy._18sameTree.com.easy._19subtreeOfAnotherTree.TreeNode(
            root.val,
            invertedRight,
            invertedLeft
        );
    }
}
```