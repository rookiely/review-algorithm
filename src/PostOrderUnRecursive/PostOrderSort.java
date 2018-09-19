package PostOrderUnRecursive;

import java.util.Stack;

public class PostOrderSort {

    public static void postSort(TreeNode node) {
        TreeNode temp = node;
        TreeNode lastVisited = null;
        Stack<TreeNode> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.left;
        }
        while (!stack.isEmpty()) {
            TreeNode tem = stack.peek();
            if (tem.right == null || tem.right == lastVisited) {
                stack.pop();
                System.out.print(tem.val+" ");
                lastVisited = tem; //这一行别忘了
            }else{
                tem = tem.right;
                while (tem != null) {
                    stack.push(tem);
                    tem = tem.left;
                }
            }
        }
    }
}
