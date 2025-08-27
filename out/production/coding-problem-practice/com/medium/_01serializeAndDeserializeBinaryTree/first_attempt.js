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

function serialize(root) {
    //serializes the tree into a string
    var s = ""

    if(root == null) return "#"

    s += root.val + "," + serialize(root.left) + "," + serialize(root.right)
    
    return s
}


function dezerialize(s) {
    //deserializes the string back into the tree

    var nodes = s.split(",")
    let index = 0;

    function helper () { // --> inner functions can read and write variables from their parent scope.
        if(nodes[index] == "#") {
            index++
            return null
        }

        let val = nodes[index];
        index++
        console.log(index)
        return new Node(val, helper(nodes, index), helper(nodes, index))
    }

    return helper(nodes, index)
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