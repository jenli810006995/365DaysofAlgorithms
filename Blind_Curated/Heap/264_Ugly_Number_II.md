An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

Solution(Python3):
```
# thought process: to set three pointers, i2, i3, i5
# each pointer multiply by ugly numbers i2, i3, and i5
# use three parallel if-statemnt to prevent duplicates

class Solution:
    def nthUglyNumber(self, n: int) -> int:
        ugly = [1]
        # three pointers
        i2, i3, i5 = 0, 0, 0
        while n > 1:
            u2, u3, u5 = 2 * ugly[i2], 3 * ugly[i3], 5* ugly[i5]
            umin = min((u2, u3, u5))
            if umin == u2:
                i2 += 1
            if umin == u3:
                i3 += 1
            if umin == u5:
                i5 += 1
                
            ugly.append(umin)
            n -= 1
        return ugly[-1]

# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/ugly-number-ii/
```
