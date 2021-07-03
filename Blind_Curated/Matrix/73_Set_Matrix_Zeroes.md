Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
You must do it in place.

Constraints:
```
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
``` 
Follow up:
```
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
```
Solution(Python3):
```
class Solution(Python3):
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # @param {integer[][]} matrix
        # @return {void}
        
        m = len(matrix)
        if m == 0:
            return
        m = len(matrix[0])
        
        row_zero = False
        for i in range(m):
            if matrix[i][0] == 0:
                row_zero = True
        col_zero = False
        for j in range(n):
            if matrix[0][j] == 0:
                col_zero = True
                
        for i in range(1, m):
            for j in range(1, n):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                    
        for i in range(1, m):
            if matrix[i][0] == 0:
                for j in range(1, n):
                    matrix[i][j] = 0 
                    
        for j in range(1, n):
            if matrix[0][j] == 0:
                for i in range(1, m):
                    matrix[i][j] = 0
                    
        if col_zero:
            for j in range(n):
                matrix[0][j] = 0
               
        if row_zero:
            for i in range(m):
                matrix[i][0] = 0
                
# TC: O(n)
# SC: O(1)

```
```
Link: https://leetcode.com/problems/set-matrix-zeroes/
```
