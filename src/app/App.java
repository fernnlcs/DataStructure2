package app;

import structures.binaryTree.SingleBinaryTree;
import structures.binaryTree.Node;

public class App {
    public static void main(String[] args) throws Exception {

        Node root = new Node(11,
                new Node(6,
                    new Node(4, null, null),
                    new Node(9,
                        new Node(7, null, null),
                        new Node(10, null, null)
                    )
                ),
                new Node(13,
                    null,
                    new Node(17,
                        new Node(16, null, null),
                        null)
                    )
                );

        SingleBinaryTree tree = new SingleBinaryTree(root);
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
        tree.byLevel();
        tree.symmetrical();
    }
}
