Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.

Example 1:
```
Input: nums = [34,23,1,24,75,33,54,8], k = 60
Output: 58
Explanation: We can use 34 and 24 to sum 58 which is less than 60.
```
Example 2:
```
Input: nums = [10,20,30], k = 15
Output: -1
Explanation: In this case it is not possible to get a pair sum less that 15.
``` 
Constraints:
```
1 <= nums.length <= 100
1 <= nums[i] <= 1000
1 <= k <= 2000
```
Solution(Python3):
```
# Brute Force

class Solution:
    def twoSumLessThanK(self, nums: List[int], k:int) -> int:
        answer = -1
        
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                sum = nums[i] + nums[j]
                if sum < k:
                    answer = max(answer, sum)
        return answer
        
# TC: O(n^2), we have two nested loops
# SC: O(1)

# Two Pointers

class Solution:
    def twoSumLessThanK(self, nums: List[int], k:int) -> int:
        nums.sort()
        answer = -1
        left = 0
        right = len(nums) - 1
        while left < right:
            sum = nums[left] = nums[right]
            if (sum < k):
                answer = max(answer, sum)
                left += 1
            else:
                right -= 1
        return answer
        
# TC: O(nlongn) sorting
# SC: O(longn) -> O(n) depending on the implemention of sorting

```
Link: https://leetcode.com/problems/two-sum-less-than-k/
