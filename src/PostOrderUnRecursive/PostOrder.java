package PostOrderUnRecursive;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PostOrder {

    public void postOrder(TreeNode node) {
        TreeNode temp = node;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pastVisited = null;
        while(temp != null){
            stack.push(temp);
            temp = temp.left;
        }
        while (!stack.isEmpty()) {
            //主要思想是如果想要输出一个节点（把每个节点看成针对他的子树的根节点）
            //就需要判断他的右子树是否为空或者刚刚访问过了
            //如果是，那么就可以访问这个（根）节点
            //如果不是，那么就转到这个(根）节点的右子树
            TreeNode tem = stack.peek();
            if (tem.right == null || tem.right == pastVisited) {
                stack.pop();
                System.out.print(tem.val+" ");
                pastVisited = tem;
            }else{
                tem = tem.right;
                while (tem != null) {
                    stack.push(tem);
                    tem = tem.left;
                }
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
        PostOrder po = new PostOrder();
        po.postOrder(root);
    }
}