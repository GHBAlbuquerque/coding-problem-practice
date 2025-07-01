class Node {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

// Leaf node
function evaluateNoChild(node) {
  return node.left === null && node.right === null;
}

// Only left child exists and has same value
function evaluateEqualValueLeftChild(node) {
  return node.left !== null && node.right === null &&
         node.val === node.left.val;
}

// Only right child exists and has same value
function evaluateEqualValueRightChild(node) {
  return node.right !== null && node.left === null &&
         node.val === node.right.val;
}

// Both children exist and have same value as parent
function evaluateEqualValues(node) {
  return node.left !== null && node.right !== null &&
         node.val === node.left.val &&
         node.val === node.right.val;
}

function countUnivalTrees(node, count = 0) {
  if (!node) {
    return count;
  }

  if (evaluateNoChild(node)) {
    count++;
    return count;
  }

  if (evaluateEqualValueLeftChild(node)) {
    count++;
  }

  if (evaluateEqualValueRightChild(node)) {
    count++;
  }

  if (evaluateEqualValues(node)) {
    count++;
  }

  count = countUnivalTrees(node.left, count);
  count = countUnivalTrees(node.right, count);

  return count;
}

// ─────────────── Test trees ───────────────

var tree1 = new Node(0,
  new Node(1),
  new Node(0,
    new Node(1,
      new Node(1),
      new Node(1)
    ),
    new Node(0)
  )
);
// Expected: 5
console.log(`Tree1 nodes: ${countUnivalTrees(tree1)}`);

var tree2 = new Node(0,
  new Node(0),
  new Node(0,
    new Node(0),
    new Node(0)
  )
);
// Expected: 5
console.log(`Tree2 nodes: ${countUnivalTrees(tree2)}`);

var tree3 = new Node(1,
  new Node(1,
    new Node(1),
    new Node(1)
  ),
  new Node(1,
    new Node(1),
    new Node(1)
  )
);
// Expected: 7
console.log(`Tree3 nodes: ${countUnivalTrees(tree3)}`);

var tree4 = new Node(0,
  new Node(1),
  new Node(0,
    new Node(0),
    new Node(0)
  )
);
// Expected: 5
console.log(`Tree4 nodes: ${countUnivalTrees(tree4)}`);

var tree5 = new Node(1,
  new Node(1,
    new Node(1),
    new Node(1)
  ),
  new Node(1,
    new Node(1),
    new Node(1)
  )
);
// Expected: 7
console.log(`Tree5 nodes: ${countUnivalTrees(tree5)}`);