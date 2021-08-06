Given a string s, find the length of the longest substring without repeating characters.

Constraints:
```
0 <= s.length <= 5 * 104
```
s consists of English letters, digits, symbols and spaces.

Solution:
```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = maxLength = 0 # initiate variables
        usedChar = {} # create an empty set
        
        for i in range(len(s)):
            if s[i] in usedChar and start <= usedChar[s[i]]:
                start = usedChar[s[i]] + 1 # the index
                
            else:
                maxLength = max(maxLength, i - start + 1) # start and i are both index, to compute their length, is the subtraction of the two and add 1
            
            usedChar[s[i]] = i # move to the next i
            
        return maxLength
            
        
# TC: O(n)
# TC: O(m), m is the size of the Char size
```
```
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
```
