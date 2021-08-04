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
        start = maxLength = 0
        usedChar = {} # create an empty set
        
        for i in range(len(s)):
            if s[i] in usedChar and start <= usedChar[s[i]]:
                start = usedChar[s[i]] + 1
            else:
                maxLength = max(maxLength, i - start + 1)
                
            usedChar[s[i]] = i
            
        return maxLength
                
# TC: O(n)
# SC: O(m), where m is the size of the char set
```
```
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
```
