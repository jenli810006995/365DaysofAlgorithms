Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Solution(Python3):
```
class Solution:
    def validPalindrome(self, s: str) -> bool:
        """
        :type s: str
        :rtype: bool
        """
        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]: # there are some characters we need to delete
                one, two = s[left:right], s[left+1:right+1]
                return one == one[::-1] or two == two[::-1]
            left, right = left + 1, right - 1
        return True
                
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/valid-palindrome-ii/
```
