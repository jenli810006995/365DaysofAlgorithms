Given a text string and words (a list of strings), return all index pairs [i, j] so that the substring text[i]...text[j] is in the list of words.

Example 1:
```
Input: text = "thestoryofleetcodeandme", words = ["story","fleet","leetcode"]
Output: [[3,7],[9,13],[10,17]]
```
Example 2:
```
Input: text = "ababa", words = ["aba","ab"]
Output: [[0,1],[0,2],[2,3],[2,4]]
Explanation: 
Notice that matches can overlap, see "aba" is found in [0,2] and [2,4].
``` 

Note:
```
All strings contains only lowercase English letters.
It's guaranteed that all strings in words are different.
1 <= text.length <= 100
1 <= words.length <= 20
1 <= words[i].length <= 50
Return the pairs [i,j] in sorted order (i.e. sort them by their first coordinate in case of ties sort them by their second coordinate).
```

Solution(Python3):
```
class Solution:
    def indexPairs(self,text: str, words: List[str]) -> List[List[int]]:
        ans = []
        for word in words:
            n = len(word)
            for i in range(0, (len(text) - n + 1)):
                if text[i:i + n] == word:
                    ans.append([i, i + n - 1])
                    ans.sort()
        return ans
```
Link: https://leetcode.com/problems/index-pairs-of-a-string/
