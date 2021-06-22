Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

Solution(Python3):
```
class Solution:
    def findRotation(self, mat: List[List[int]], target: List[List[int]]) -> bool:
        for _ in range(4):
            if mat == target:
                return True
            mat = [list(x) for x in zip(*mat[::-1])]
        return False

# TC: O(n^2), n is the length of the array in the matrix
# SC: O(1)
```
```
Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
```
