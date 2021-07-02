Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray 
```
[numsl, numsl+1, ..., numsr-1, numsr] 
```
of which the sum is greater than or equal to target. 
If there is no such subarray, return 0 instead.

Constraints:
```
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 105
``` 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).

Solution(Python3):
```
class Solution:
    def minSubArrayLen(self, target, nums):
        i, res = 0, len(nums) + 1
        for j in range(len(nums)):
            target -= nums[j]
            while target <= 0:
                res = min(res, j - i + 1)
                target += nums[i]
                i += 1
        return res % (len(nums) + 1)
        
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/minimum-size-subarray-sum/
```
