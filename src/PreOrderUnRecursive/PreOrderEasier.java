package PreOrderUnRecursive;

import java.util.Stack;

public class PreOrderEasier {

    public void preOrder(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        while(node != null){
            System.out.print(node.val + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            node = node.left;
            if (node == null && !stack.isEmpty()) {
                node = stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        PreOrderEasier po = new PreOrderEasier();
        po.preOrder(root);
    }
}
