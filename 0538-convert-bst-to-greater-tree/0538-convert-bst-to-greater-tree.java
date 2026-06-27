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
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        // Traverse right subtree first
        convertBST(root.right);
        // Update running sum and node value
        sum += root.val;
        root.val = sum;
        // Traverse left subtree
        convertBST(root.left);
        return root;
    }
}




// class Solution {
//     public TreeNode convertBST(TreeNode root) {
//         ArrayList<TreeNode> arr = new ArrayList<>();
//         inorder(root, arr);
//         Collections.reverse(arr);
//         int sum = 0;
//         for(int i=0; i<arr.size(); i++){
//             sum+= arr.get(i).val;
//             arr.get(i).val = sum;
//         }
//         return root;
//     }
//     public void inorder(TreeNode root, ArrayList<TreeNode>arr){
//         if(root==null) return;
//         inorder(root.left, arr);
//         arr.add(root);
//         inorder(root.right, arr);
//     }
// }