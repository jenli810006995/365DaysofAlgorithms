Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
It is guaranteed that the answer will fit in a 32-bit integer.
A subarray is a contiguous subsequence of the array.

Constraints:
```
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
```
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Solution(Python3):
```
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        
        curMax, curMin = 1, 1 # 1 is the neutral value instead of 0
        for n in nums: # loop thru the list
            tmp = curMax * n # we have to keep track of the product
            curMax = max(curMax * n, curMin * n, n)
            curMin = min(tmp, curMin * n, n)
            res = max(res, curMax)
        return res
    
# TC: O(n)
# SC: O(1)

```
```
Link: https://leetcode.com/problems/maximum-product-subarray/
```
