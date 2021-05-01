Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Solution(Python3):
```
class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        for i in range(grid):
            for j in range(grid[i]):
                # it was on the first row
                if i == 0:
                    # it was not on the first column
                    if j != 0:
                        grid[i][j] += grid[i][j - 1] # along the row to add values                        
                else: not on the first row
                    if j == 0: # the first column
                        grid[i][j] += grid[i - 1][j] # add the previous rows on the same column
                    else:
                        # finding minimum
                        grid[i][j] = min(grid[i][j]+ grid[i-1][j], grid[i][j]+grid[i][j - 1])
        # return last element
        return grid[-1][-1]                    
```
Link: https://leetcode.com/problems/minimum-path-sum/
