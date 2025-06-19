/*
```
      root
     /    \
  left   right
   /
left.left
```
*/

class Node {
    constructor(val, left = null, right = null) {
        this.val = val,
        this.left = left,
        this.right = right
    }
}

// function serialize(root) {
//     //serializes the tree into a string
//     var s = ""

//     s += root.val

//     if(root.left == null) {
//         s += ",#"
//         return s
//     }

//     s += "," + serialize(root.left)
//     return s;
// }


function serialize(root) {
    //serializes the tree into a string
    var s = ""

    if(root == null) return "#"

    s += root.val + "," + serialize(root.left) + "," + serialize(root.right)
    
    return s
}

function dezerialize(s) {
    //deserializes the string back into the tree
    if(s[0] == "#") return null
    
    const nodes = s.split(",")
    var root = nodes[0];
    nodes.slice(1)
    
    return new Node(root, dezerialize(nodes.join(",")), nodes.slice(1).join(","))
}

console.log("----- TEST CASE 1 ----")

const testTree1 = new Node('root', new Node('left', new Node('left.left')), new Node('right'));
console.log(serialize(testTree1))
console.log(dezerialize(serialize(testTree1)))

console.log("----- TEST CASE 2 ----")

const testTree2 = new Node('root', new Node('left'), new Node('right', null, new Node('right.right')));
console.log(serialize(testTree2))
console.log(dezerialize(serialize(testTree2)))

console.log("----- TEST CASE 3 ----")

const testTree3 = new Node('root', new Node('left', new Node('left.left', null, new Node('left.left.right'))), new Node('right'));
console.log(serialize(testTree3))
console.log(dezerialize(serialize(testTree3)))