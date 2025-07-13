class Node {
    int val;
    Node left;
    Node right;

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(int val) {
        this.val = val;
    }

    public Node invertNode() {
        Node invertedLeft = null;
        Node invertedRight = null;

        if (this.left != null) invertedLeft = this.left.invertNode();
        if (this.right != null) invertedRight = this.right.invertNode();

        this.left = invertedRight;
        this.right = invertedLeft;

        return this;
    }

    public String toString() {
        String s = "";

        s = s + this.val;
        if (this.left != null) s += this.left.toString();
        if (this.right != null) s += this.right.toString();

        return s;
    }
}


public class InvertBinaryTree {
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

        System.out.printf("Original tree: %s%n", root.toString());
        root.invertNode();
        System.out.printf("Inverted tree: %s%n", root.toString());


        Node root2 = new Node(2,
                new Node(1, null, null),
                new Node(5, null, null));
        System.out.printf("Original tree: %s%n", root2.toString());
        root2.invertNode();
        System.out.printf("Inverted tree: %s", root2.toString());
    }
}