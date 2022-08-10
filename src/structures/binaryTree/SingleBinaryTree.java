package structures.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * BinaryTree
 */
public class SingleBinaryTree {

    public Node root;

    public SingleBinaryTree(Node root) {
        this.root = root;
    }

    public void preOrder() {
        System.out.println("\n\n> > > Percurso em Pré-Ordem < < <");
        this.root.preOrder();
        System.out.println("\n");
    }

    public void inOrder() {
        System.out.println("\n\n> > > Percurso em Ordem < < <");
        this.root.inOrder();
        System.out.println("\n");
    }

    public void postOrder() {
        System.out.println("\n\n> > > Percurso em Pós-Ordem < < <");
        this.root.postOrder();
        System.out.println("\n");
    }

    public void byLevel() {
        System.out.println("\n\n> > > Percurso por Nível < < <");

        if (this.root != null) {

            Queue<Node> queue = new LinkedList<>();
            queue.add(this.root);

            while (!queue.isEmpty()) {
                Node current = queue.remove();

                System.out.print("[" + current.content + "] ");

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        System.out.println("\n");
    }

    public void symmetrical() {
        System.out.println("\n\n> > > Percurso em Ordem Simétrica < < <");

        if (this.root != null) {

            Stack<Node> stack = new Stack<>();
            stack.push(this.root);

            while (!stack.isEmpty()) {
                Node current = stack.pop();

                if (current != null) {
                    stack.push(current.left);
                } else {
                    current = stack.pop();

                    System.out.print("[" + current.content + "] ");

                    stack.push(current.right);
                }
            }
        }

    }
}
