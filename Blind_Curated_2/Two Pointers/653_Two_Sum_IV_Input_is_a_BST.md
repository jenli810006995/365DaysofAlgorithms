Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.

Constraints:
```
The number of nodes in the tree is in the range [1, 104].
-104 <= Node.val <= 104
root is guaranteed to be a valid binary search tree.
-105 <= k <= 105
```

Solution:
```
class Solution:
    def findTarget(self, root: TreeNode, k: int) -> bool:
        if not root: return False
        bfs, s = [root], set()
        for i in bfs:
            if k - i.val in s:
                return True
            s.add(i.val)
            if i.left: bfs.append(i.left)
            if i.right: bfs.append(i.right)
        return False

# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
```
