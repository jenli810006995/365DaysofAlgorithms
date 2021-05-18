Given an integer n, return true if and only if it is an Armstrong number.

The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n.

Example 1:
```
Input: n = 153
Output: true
Explanation: 153 is a 3-digit number, and 153 = 13 + 53 + 33.
```
Example 2:
```
Input: n = 123
Output: false
Explanation: 123 is a 3-digit number, and 123 != 13 + 23 + 33 = 36.
``` 
Constraints:
```
1 <= n <= 108
```

Solution(Python3):
```
class Solution:
  def isArmstrong(self, n: int) -> bool:
      import math
      total = 0
      
      # calculate k
      k = math.floor(math.log10(n)) + 1
      
      # Create a copy of n so that we could compare the total to n w/t modifying its original values
      c = n
      while c:
          digit = c % 10 # Extract the digit
          total += digit ** k
          c // = 10
          
      return total == n
          
# TC: O(n), n is the number of digits in N, we need to iterate all digits
# SC: O(1)
```
```
Link: https://leetcode.com/problems/armstrong-number/
Credit: https://leetcode.com/problems/armstrong-number/discuss/356118/Python-Calculate-k-with-formula
```
