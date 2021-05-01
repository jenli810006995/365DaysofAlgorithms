According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.

Solution(Python3):
```
class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        def neighbors_of_cell(x:int, y:int) -> int:
            left = board[x - 1][y] if x else 0
            right = board[x + 1][y] if x + 1 < m else 0
            up = board[x][y - 1] if y else 0
            down = board[x][y + 1] if y + 1 < n else 0
            left_up = board[x - 1][y - 1] if x and y else 0
            left_down = board[x - 1][y + 1] if x and y + 1 < n else 0
            right_up = board[x + 1][y - 1] if x + 1 < m and y else 0
            right_down = board[x + 1][y + 1] if x + 1 < m and y + 1 < n else 0
            return left+right+up+down+left_up+left_down+right_up+right_down
            
        m = len(board)
        n = len(board[0])
        neighbors = [[0 for _ in range(n)] for _ in range(m)]

        for r in range(m):
            for c in range(n):
                neighbors[r][c] = neighbors_of_cell(r, c)
                
        for r in range(m):
            for c in range(n):
                if board[r][c]: # live cell
                    if neighbors[r][c] > 3: # over-population
                        board[r][c] = 0 # dead
                    elif neighbors[r][c] < 2: # under-population
                        board[r][c] = 0 # dead
                else:
                    if neighbors[r][c] == 3: # reproduction
                        board[r][c] = 1
```
Link: https://leetcode.com/problems/game-of-life/
