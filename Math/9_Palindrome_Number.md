Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Example 1:
```
Input: x = 121
Output: true
```
Example 2:
```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```
Example 3:
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```
Example 4:
```
Input: x = -101
Output: false
``` 
Constraints:
```
-231 <= x <= 231 - 1
``` 
Follow up: Could you solve it without converting the integer to a string?

Solution(Python3):
```
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
          return False
          
        ranger = 1
        while x // ranger > = 10: # in Python, floor division is //, means the result is always an integer
            ranger *= 10
            
        while x:
            left = x // ranger
            right = x % 10
            if left != right:
                return False
            x = (x % ranger) // 10
            ranger /= 100
            
        return True
        
# TC: O(long10(n)), because we divide the input by 10 for each iteration
# SC: O(1)
```
```
Link: https://leetcode.com/problems/palindrome-number/
Credit: https://leetcode.com/problems/palindrome-number/discuss/5128/Python-solution-based-on-the-algorithm-in-leetcode-blog
```
