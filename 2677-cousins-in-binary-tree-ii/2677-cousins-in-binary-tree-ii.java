/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {

        if (root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        root.val = 0;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelSum = 0;
            List<TreeNode> currentLevelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevelNodes.add(node);
                
                if (node.left != null) {
                    levelSum += node.left.val;
                    queue.add(node.left);
                }
                if (node.right != null) {
                    levelSum += node.right.val;
                    queue.add(node.right);
                }
            }

            for (TreeNode node : currentLevelNodes) {
                int leftVal = (node.left != null) ? node.left.val : 0;
                int rightVal = (node.right != null) ? node.right.val : 0;
                
                int sumOfCousins = levelSum - (leftVal + rightVal);
                
                if (node.left != null) {
                    node.left.val = sumOfCousins;
                }
                if (node.right != null) {
                    node.right.val = sumOfCousins;
                }
            }
        }

        return root;
    }
}