
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root ==null) return  0;
        Stack<TreeNode> stack = new Stack<>();
        // Map to store the depth of each node
        HashMap<TreeNode, Integer> depthMap = new HashMap<>();
        // Initialize with root node and depth of 1
        stack.push(root);
        depthMap.put(root, 1);

        int res = 0;
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            int depth = depthMap.get(node);
            if (node != null) {
                // Update the maximum depth
                res = Math.max(res, depth);

                // Push left and right children into the stack
                if (node.left != null) {
                    stack.push(node.left);
                    depthMap.put(node.left, depth + 1);
                }

                if (node.right != null) {
                    stack.push(node.right);
                    depthMap.put(node.right, depth + 1);
                }
            }
        }
        return res;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }