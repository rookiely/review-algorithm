package InOrderNTransfer;

import java.util.Stack;

class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
    }
}

public class InOrderNTransfer {

    public static void inOrder(Node node, int num) {
        Stack<Node> stack = new Stack<>();
        int count = 0;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                Node pop = stack.pop();
                count++;
                if (count == num) {
                    System.out.println(pop.val);
                    return;
                }
                node = pop.right;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        inOrder(root, 4);
    }
}

