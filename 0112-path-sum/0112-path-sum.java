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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return Sum1(root,0,targetSum);
    }
    public boolean Sum1(TreeNode root, int sum , int targetSum){
        if(root==null) return false;
        sum = sum + root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum) return true;
            return false;
        }
        return Sum1(root.left,sum,targetSum)||Sum1(root.right,sum,targetSum);
    }
    // meaning Left subtree mein path sum target ke equal milta hai OR right subtree mein milta hai? last line meaningn
    // root.left==null && root.right==null is mien leaf node tk ja rhe h agr leaf node agya and apna sum target k equal hogya toh return true;
    // nhi mila toh kisi dusre wala node leaf pe try kro
}