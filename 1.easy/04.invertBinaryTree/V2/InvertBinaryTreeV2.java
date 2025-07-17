class Node {
    int val;
    Node left;
    Node right;

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static Node invertBinaryTree(Node node) {
        if (node == null) return node;

        Node invertedLeftSide = Node.invertBinaryTree(node.left);
        Node invertedRightSide = Node.invertBinaryTree(node.right);

        return new Node(
                node.val,
                invertedRightSide,
                invertedLeftSide
        );
    }

    public static String stringifyBinaryTree(Node node) {
        String s = "";

        if (node == null) return s;
        s = node.val + stringifyBinaryTree(node.left) + stringifyBinaryTree(node.right);

        return s;
    }
}

public class InvertBinaryTreeV2 {
    public static void main(String[] args) {
        //Input:  root = [4,2,7,1,3,6,9]
        Node root = new Node(4,
                new Node(2,
                        new Node(1, null, null),
                        new Node(3, null, null)
                ),
                new Node(7,
                        new Node(6, null, null),
                        new Node(9, null, null)
                )
        );

        System.out.printf("Original tree: %s%n", Node.stringifyBinaryTree(root));
        Node invertedNode = Node.invertBinaryTree(root);
        System.out.printf("Inverted tree: %s%n", Node.stringifyBinaryTree(invertedNode));


        Node root2 = new Node(2,
                new Node(1, null, null),
                new Node(5, null, null));
        System.out.printf("Original tree: %s%n", Node.stringifyBinaryTree(root2));
        Node invertedNode2 = Node.invertBinaryTree(root2);
        System.out.printf("Inverted tree: %s%n", Node.stringifyBinaryTree(invertedNode2));

    }
}