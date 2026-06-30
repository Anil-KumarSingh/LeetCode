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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        leaves(root1, li1);
        leaves(root2, li2);
        return li1.equals(li2);
    }
    public void leaves(TreeNode root, List<Integer>li){
        if (root == null) return;
        if (root.left == null && root.right == null) {
            li.add(root.val);
        }
        leaves(root.left, li);
        leaves(root.right, li);
        
    }
    
}