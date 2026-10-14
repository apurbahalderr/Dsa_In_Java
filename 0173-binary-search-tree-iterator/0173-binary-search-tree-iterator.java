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
class BSTIterator {
  private List<Integer> values;
  private int index;

  public BSTIterator(TreeNode root) {
    values = new ArrayList<>();
    inorderTraversal(root);
    index = -1;
  }

  public boolean hasNext() {
    return index + 1 < values.size();
  }

  public int next() {
    return values.get(++index);
  }

  private void inorderTraversal(TreeNode node) {
    if (node == null) return;
    inorderTraversal(node.left);
    values.add(node.val);
    inorderTraversal(node.right);
  }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */