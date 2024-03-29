Given a string s, return the longest palindromic substring in s.

Constraints:
```
1 <= s.length <= 1000
```
s consist of only digits and English letters.

Solution:
```
class Solution:
    def longestPalindrome(self, s: str) -> str:
        res = ""
        for i in range(len(s)):
            # odd case, like 'aba'
            tmp = self.helper(s, i, i)
            if len(tmp) > len(res):
                res = tmp
                
            # even case, like 'abba'
            tmp = self.helper(s, i, i + 1)
            if len(tmp) > len(res):
                res = tmp
        return res
        
    def helper(self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l + 1: r]
# TC: O(n^2), expanded around center
# SC: O(1)
```
```
Link: https://leetcode.com/problems/longest-palindromic-substring/
```
