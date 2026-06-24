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
    public void flatten(TreeNode root) {
        if(root==null)
        return;
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        root.left = null;
        root.right = null;
        flatten(lst);
        flatten(rst);
        root.right = lst;
        TreeNode last = root;
        while(last.right!=null) last = last.right;
        last.right = rst;
    }
}




// class Solution {
//     public void flatten(TreeNode root) {
//         if(root==null) return;
//        List<TreeNode> ans = new ArrayList<>(); 
//        preorder(root,ans);
//        for(int i=0; i<ans.size()-1; i++){
//         TreeNode a = ans.get(i);
//         TreeNode b = ans.get(i+1);
//         a.right=b;
//         a.left=null;
//        }
//         TreeNode Last = ans.get(ans.size()-1);
//         Last.right = null;
//         Last.left= null;
        
//     }
//     public static void preorder(TreeNode root, List<TreeNode> ans){
//         if(root==null) return;
//         ans.add(root);
//         preorder(root.left, ans);
//         preorder(root.right, ans);

// }
// }