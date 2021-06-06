In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.

Solution(Python3):
```
class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        order_map = {} # create an empty map
        for index, val in enumerate(order):
            order_map[val] = index
            
        for i in range(len(words) - 1):
        
            for j in range(len(words[i])):
                if j >= len(words[i + 1]): return False
                
                if words[i][j] != words[i + 1][j]:
                    if order_map[words[i][j]] > order_map[words[i + 1][j]]: return False
                    # if we find the first different character, and they are sorted
                    # there is no need to check remaining letters
                    break
        return True
               
            
 # TC: O(M), M is the total number of characters in words
 # SC: O(1)

```
Link: https://leetcode.com/problems/verifying-an-alien-dictionary/
