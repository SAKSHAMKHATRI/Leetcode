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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>arr = new ArrayList<>();
        Post(root,arr);
        return arr;
    }
    public void Post(TreeNode root, ArrayList<Integer>arr){
        if(root==null) return;
        Post(root.left,arr);
        Post(root.right,arr);
        arr.add(root.val);
    }
}