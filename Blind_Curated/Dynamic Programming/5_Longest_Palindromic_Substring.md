Given a string s, return the longest palindromic substring in s.

Constraints:
```
1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case),
```
Solution:
```
class Solution:
    def longestPalindrome(self, s):
        res = ""
        for i in range(len(s)):
            ## odd case, like "abba"
            tmp = self.helper(s, i , i)
            if len(tmp) > len(res):
                res = tmp
                
            # even case, like "abba"
            tmp = self.helper(s, i , i + 1)
            if len(tmp) > len(res):
                res = tmp
        return res
        
        
    # get the longest palindrome, l, r are the middle indexes
    # from inner to outer
    def heler(self, s, l, r):
        while l >= 0 and and r < len(s) and s[l] == s[r]:
            l -= 1, r += 1
        return s[l + 1: r]
        
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/longest-palindromic-substring/
```
