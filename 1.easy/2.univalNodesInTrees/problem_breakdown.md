# Explanation of the Solution

A unival subtree is a subtree where all the nodes have the same value.

### 🔍 Breakdown of unival subtrees:
	1.	Leaf nodes are always unival:
	•	The 1 on the far left
	•	The two 1s at the bottom
	•	The rightmost 0

```
       0
      / \
     1   0
        / \
       1   0
      / \
     1   1
```

### ✅ That’s 4 unival subtrees so far.
	2.	The subtree rooted at the node with two 1s:

```
  1
 / \
1   1
```


✅ All nodes are 1, so this whole subtree is unival.
✅ That’s the 5th unival subtree.

⸻
# Do Nodes with only one child count as unival?

### 🔁 Apply to your question:

```Do nodes with only one child (with the same value as parent) count as unival?```

Yes, they do under this definition — if:
	•	All nodes in that subtree exist and have the same value.
	•	That includes the parent and the only child.

Because:
	•	There’s no rule saying “you must have both left and right children.”
	•	It only matters that all existing nodes in the subtree share the same value.

✅ Example:

This is a valid unival subtree under this definition:
```
  1ß
 /
1
```

Because:
	•	It’s a subtree
	•	It has only two nodes, and both are 1
	•	Therefore, all nodes under the root have the same value ⇒ ✅ unival

⸻
📌 Final Answer:

Do nodes with only one child (with the same value as the parent) count as unival?

✅ Yes! they do, as long as:
	•	The entire subtree (all nodes under that root) has the same value.

The shape of the tree (complete or not) doesn’t matter. Only value uniformity matters.

⸻



