## Daily Coding Problem
**Given the root of a binary tree, return the length of the diameter of the tree.**

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

Example 1:
```
    1
   / \
  2   3
 / \
4   5

Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
```

Example 2:
```
Input: root = [1,2]
Output: 1
```

Example 3:
```
     1
     / 
    2   
   / \
  3   4
       \
        5
Input: root = [1,2,null,3,4,null,5]
Output: 3
Explanation: 3 is the length of the path [3,2,4,5] or [1,2,3,5].
```

Constraints:
```
The number of nodes in the tree is in the range [1, 104].
-100 <= V1.04.invertBinaryTree.com.easy.V1.com.easy._04invertBinaryTree.Node.val <= 100
```