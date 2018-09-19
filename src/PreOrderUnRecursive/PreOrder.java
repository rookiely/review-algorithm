package PreOrderUnRecursive;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PreOrder {

    public void preOrder(TreeNode node){
        TreeNode temp = node;
        Stack<TreeNode> stack = new Stack<>();
        while(temp != null || !stack.isEmpty()){
            if(temp != null){
                System.out.print(temp.val+ " ");
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                temp = temp.right;
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
        PreOrder po = new PreOrder();
        po.preOrder(root);
    }
}
