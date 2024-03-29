Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Constraints:
```
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
``` 
Follow up: Could you use search pruning to make your solution faster with a larger board?

Solution(Python3):
```
class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        if not board:
            return False
        for i in range(len(board)):
             for j in range(len(board[0])):
                 if self.dfs(board, i, j, word):
                     return True
         return False
         
         # check whether can find word, start at (i, j) position
         
     def dfs(self, board, i, j, word):
         if len(word) == 0: # all the characters are checked
             return True
         if i < 0 or i >= len(board) or j < 0 or j >= len(board[0]) or word[0] != board[i][j]:
             return False
             
         tmp = board[i][j] # first character is found. Check the remaining part
         board[i][j] = "#" # avoid visiting again
         
         # check whether can find "word" along one direction
         res = self.dfs(board, i + 1, j, word[1:]) or self.dfs(board, i - 1, j, word[1:]) or self.dfs(board, i, j + 1, word[1:]) or self.dfs(board, i, j - 1, word[1:])
         board[i][j] = tmp
         return res
         
# TC: O(M*N*4^L), where M*N is the size of the board, 4^L for each cell becoz of the recursion
# SC: O(L), L is the length of the word
```
```
Link: https://leetcode.com/problems/word-search/
```
