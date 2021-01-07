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
    Map<Integer, Integer> map = new HashMap();
    public TreeNode buildTree(int[] preorder, int[] inorder){
        for(int i = 0; i < inorder.length; i ++)
            map.put(inorder[i], i);
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0);
    }
    
    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end, int index){
        if(start > end) return null;
        TreeNode root = new TreeNode(preorder[index]);
        
        int inIndex = map.get(preorder[index]);
        
        root.left = buildTree(preorder, inorder, start, inIndex - 1, index + 1);
        root.right = buildTree(preorder, inorder, inIndex + 1, end, index + inIndex - start + 1);
        
        return root;
    
    }
}

// Link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
