## Coding Problem: Serialize and Deserialize a Binary Tree

Given the following `Node` class:

```python
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```

### Problem

Implement `serialize(root)`, which serializes the tree into a string, and `deserialize(s)`, which deserializes the string back into the tree.

**Example Test:**

```python
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
```

Binary Tree

```
      root
     /    \
  left   right
   /
left.left
```

Example output for serialize method
```
root,left,left.left,#,#,#,right,#,#
```

Breakdown:

Visit root
    Visit left
        Visit left.left
        left of left.left is null: #
        right of left.left is null: #
    right of left is null: #
Visit right
    left of right is null: #
    right of right is null: #