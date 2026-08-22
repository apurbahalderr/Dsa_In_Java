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
    List<Integer> arr;
    public List<Integer> preorderTraversal(TreeNode root) {
        arr = new ArrayList<>();
        preorderHelper(root);
        return arr;
    }

    private void preorderHelper(TreeNode root) {
        if (root == null)
            return;
        arr.add(root.val);
        preorderHelper(root.left);
        preorderHelper(root.right);
    }
}