Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Constraints:
```
1 <= n <= 20
```
Solution(Python3):

Intuition: fill the matrix with all 0's, then walk the spiral path and write the number 1 to n * n. 
Make a right turn when the number ahead is already non-zero.

```
class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        A = [[0] * n for _ in range(n)]
        i, j, di, dj = 0, 0, 0, 1
        for k in range(n * n):
            A[i][j] = k + 1
            if A[(i + di) % n][(j + dj) % n]:
                di, dj = dj, - di
            i += di
            j += dj
        return A

# TC: O(n^2)
# SC: (1)
```
```
Link: https://leetcode.com/problems/spiral-matrix-ii/ 
```
