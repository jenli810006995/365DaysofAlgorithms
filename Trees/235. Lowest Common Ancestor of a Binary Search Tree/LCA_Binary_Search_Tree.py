# BST
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        parent_val = root.val
        
        # value of p
        p_val = p.val
        
        # value of q
        q_val = q.val
        
        # if both p and q are gt than parent
        if p.val > parent_val and q.val > parent_val:
            return self.lowestCommonAncestor(root.right, p, q)
            
        # if both p and q are lt than parent
        elif p.val < parent_val and q.val < parent_val:
            return self.lowestCommonAncestor(root.left, p, q)
         
        # we have found the split point: the LCA
        else:
            return root
            
# TC: O(N)
# SC: O(N)
# Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
        
