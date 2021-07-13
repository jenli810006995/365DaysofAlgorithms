Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Constraints:
```
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
```
Solution(Python3):
```
class Solution:
    def isPalindrome(self, s: str) -> bool:
        n = len(s)
        left = 0
        right = n - 1
        while left < n - 1 and not s[left].isalnum():
            left += 1
        while right > 0 and not s[right].isalnum():
            right -= 1
        while left < right:
            if s[left].lower() != s[right].lower():
                return False
                
            left += 1
            while not s[left].isalnum():
                left += 1
            right -= 1
            while not s[right].isalnum():
                right -= 1
        return True
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/valid-palindrome/
```
