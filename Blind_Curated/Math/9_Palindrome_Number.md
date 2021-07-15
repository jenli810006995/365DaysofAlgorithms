Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Constraints:
```
-231 <= x <= 231 - 1
 ```
Follow up: Could you solve it without converting the integer to a string?

Solution(Python3):
```
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x is 0:
            return False # bc a negative number is not a palindrome
            
       #else:
       ranger = 1
       while x // ranger >= 10:
           ranger *= 10
           
       while x:
           left = x // ranger
           right = x % 10
           if left != right:
               return False
               
           x = (x % ranger) // 10
           ranger /= 100
       
       return True
            
# TC: O(log10n), we divide the input by 10 for each iteration. 
# SC: O(1)
```
```
Link: https://leetcode.com/problems/palindrome-number/
```
