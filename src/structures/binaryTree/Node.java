package structures.binaryTree;

/**
 * Node
 */
public class Node {

    public int content;
    public Node left;
    public Node right;

    public Node(int content, Node left, Node right) {
        this.content = content;
        this.left = left;
        this.right = right;
    }

    public void preOrder() {
        System.out.print("[" + this.content + "] ");
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    public void inOrder() {
        if (this.left != null) {
            this.left.inOrder();
        }
        System.out.print("[" + this.content + "] ");
        if (this.right != null) {
            this.right.inOrder();
        }
    }

    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.print("[" + this.content + "] ");
    }

}
