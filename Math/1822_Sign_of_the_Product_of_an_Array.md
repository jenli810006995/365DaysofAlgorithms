There is a function signFunc(x) that returns:
```
1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
```
You are given an integer array nums. Let product be the product of all values in the array nums.
Return signFunc(product).

Solution(Python3):
```
class Solution:
    def arraySign(self, nums: List[int]) -> int:
        ans = 1
        for x in nums:
            if x == 0: return 0
            if x < 0: ans *= -1
        return ans
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
```
