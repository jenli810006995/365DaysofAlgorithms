Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

Solution(Python3):
```
class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        res = []
        
        carry = 0
        p1 = len(num1) - 1
        p2 = len(num2) - 1
        
        while p1 >= 0 or p2 >= 0:
            x1 = ord(num1[p1]) - ord('0') if p1 >= 0 else 0
            x2 = ord(num2[p2]) - ord('0') if p2 >= 0 else 0
            
            value = (x1 + x2 + carry) % 10
            carry = (x1 + x2 + carry) // 10
            
            res.append(value)
            p1 -= 1
            p2 -= 1
            
        if carry:
            res.append(carry)
            
        return ''.join(str(x) for x in res[::-1])
            
# TC: O(max(N1, N2)), N1, N2 are the lengths of num1 and num2
# SC: O(max(N1, N2)) because the length of the new string is at most max(N1, N2) + 1
```
```
Link: https://leetcode.com/problems/add-strings/
```