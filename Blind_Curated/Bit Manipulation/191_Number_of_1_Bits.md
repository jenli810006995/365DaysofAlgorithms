Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:
```
Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
```
Constraints:
```
The input must be a binary string of length 32.
Follow up: If this function is called many times, how would you optimize it?
```

Solution:
```
## Built-in solution with built-in function
class Solution:
    def hammingWeight(self, n: int) -> int:
        """
        :type n: int
        :rtype: int
        """
        return bin(n).count("1")

# TC: O(n)
# SC: O(1)

## Use bit operation to cancel 1 at each round
def hammingWeight(self, n):
    """
    :type n: int
    :rtype: int
    """
    c = 0 # initializa the count
    while n:
        n &= n - 1 # bit operation, it would remove the last significant 1
        c += 1 
    return c
    
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/number-of-1-bits/
```
