Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Constraints:
```
1 <= n <= 231 - 1
```

Solution:
```
class Solution:
    def isHappy(self, n: int) -> bool:
        visit = set() # keep track of every number we visited
        while n not in visit:
            visit.add(n)
            n = self.sumofSquares(n)
            
            if n == 1:
                return True
        return False
            
    def sumofSquares(self, n:int) -> int:
        output = 0
        while n:
            digit = n % 10
            digit = digit ** 2
            output += digit
            n = n // 10 # the numerical part
        return output
            
# TC: O(n), because of a set
# SC: O(n)
```
```
Link: https://leetcode.com/problems/happy-number/
```
