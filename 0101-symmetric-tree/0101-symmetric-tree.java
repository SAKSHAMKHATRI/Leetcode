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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return IsIdentical(root.left,root.right);
    }
    public boolean IsIdentical(TreeNode r1 , TreeNode r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val != r2.val) return false;
        return IsIdentical(r1.left,r2.right) && IsIdentical(r1.right,r2.left);
    }
    }
    // subtree ko alg alg krlia fr 
    // jo element left substree k left mein hai kya woh ? right substree k right mein h.
    // same dusre case mein hoga 
    // yeh subtree k liye  IsIdentical(root.left,root.right); left , right 
    // yeh unke elements k liye IsIdentical(r1.left,r2.right) && IsIdentical(r1.right,r2.left);
