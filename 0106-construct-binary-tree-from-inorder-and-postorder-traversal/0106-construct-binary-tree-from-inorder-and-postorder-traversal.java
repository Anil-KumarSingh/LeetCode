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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n-1, 0, n-1, inorder, postorder);
    }
    public static TreeNode build(int inlo, int inhi, int poslo, int poshi, int inorder[], int postorder[]){
        if(poslo>poshi || inlo>inhi) return null;
        int val = postorder[poshi];
        TreeNode root = new TreeNode(val);
        int r=-1;
        for(int i=inlo; i<=inhi; i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt = r-inlo;
        root.left=build(inlo, r-1, poslo, poslo+cnt-1, inorder, postorder);
        root.right=build(r+1, inhi, poslo+cnt, poshi-1, inorder, postorder);
        return root;
    }
}