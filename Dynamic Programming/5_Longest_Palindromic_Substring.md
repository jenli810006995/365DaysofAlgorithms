Given a string s, return the longest palindromic substring in s.

Example 1:
```
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```
Example 2:
```
Input: s = "cbbd"
Output: "bb"
```
Example 3:
```
Input: s = "a"
Output: "a"
```
Example 4:
```
Input: s = "ac"
Output: "a"
``` 
Constraints:
```
1 <= s.length <= 1000
```
s consist of only digits and English letters (lower-case and/or upper-case),

Solution(Python):
```
class Solution:
    def longestPalindrome(self, s: str) -> str:
        res = ""
        for i in range(len(s)):
            # odd case, like "aba"
            tmp = self.helper(s, i, i)
            if len(tmp) > len(s):
                res = tmp
            # even case, like "abba"
            tmp = self.helper(s, i, i+1)
            if len(tmp) > len(res):
                res = tmp
        return res
            
    # get the longest palindrome. l, r are the middle indexes
    # from inner to outer
    def helper(self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l+1:r]
# TC: O(n^2), since expanding a palindrome from the center takes O(n). The overall time complexity is O(n^2)
# SC: O(1)
```
Link: https://leetcode.com/problems/longest-palindromic-substring/
