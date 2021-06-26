Given an m x n matrix, return all elements of the matrix in spiral order.

Constraints:
```
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
```

Solution(Python3):
```
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        while matrix:
            if matrix[0]:
                res.extend(matrix[0])
                matrix = matrix[1:] # get rid of the first row
                
            if matrix and matrix[0]:
                for row in matrix:
                    res.append(matrix.pop()) # .pop() means remove the return the "last" object in the list
            if matrix:
                res.extend(matrix.pop([::-1]))
            if matrix and matrix[0]:
                for row in matrix[::-1]:
                    res.append(row.pop(0))
                    
       return res
                
# TC: O(n), n is the total number of elements in the input matrix
# SC: O(1), without considering the output array
# SC: O(n), if considering the output array

```
```
Link: https://leetcode.com/problems/spiral-matrix/
```
