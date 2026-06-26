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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);

            // Case 1: new node is left child of stack top
            if (preorder[i] < stack.peek().val) {
                stack.peek().left = node;
            } else {
                // Case 2: new node is right child of the last popped node
                TreeNode parent = null;
                while (!stack.isEmpty() && preorder[i] > stack.peek().val) {
                    parent = stack.pop();
                }
                parent.right = node;
            }

            stack.push(node);
        }

        return root;
    }
}




// class Solution {
//     public TreeNode bstFromPreorder(int[] preorder) {
//         int[] inorder = Arrays.copyOf(preorder, preorder.length);
//         Arrays.sort(inorder);
//           int n = inorder.length;
//         return build(0,n-1,0,n-1,inorder,preorder);
//     }
//     public static TreeNode build(int preLo, int preHi, int inLo, int inHi, int inorder[], int preorder[]) {
//         if(preLo > preHi || inLo > inHi) return null;
//         int val = preorder[preLo];
//         TreeNode root = new TreeNode(val);
//         int r = 0;
//         for(int i=inLo;i<=inHi;i++){ // locating root in inorder array
//             if(inorder[i]==val){
//                 r = i;
//                 break;
//             }
//         }
//         int cnt = r - inLo; // Number of elements in LST
//         root.left = build(preLo+1,preLo+cnt,inLo,r-1,inorder,preorder);
//         root.right = build(preLo+cnt+1,preHi,r+1,inHi,inorder,preorder);
//         return root;
//     }

        
    
// }