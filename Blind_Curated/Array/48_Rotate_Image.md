You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Solution(Python3):
```
class Solution:
    def rotate(self, A):
        n = len(A)
        for i in range(n//2):
            for j in range(n - n//2):
                A[i][j], A[~j][i], A[~i][~j], A[j][~i] = A[~j][i], A[~i][~j], A[j][~i], A[i][j]

# TC: O(m), m is the number of cells in a grid. We traspose the matrix, and reverse each row 
# SC: O(1)
```
```
Link: https://leetcode.com/problems/rotate-image/
```
