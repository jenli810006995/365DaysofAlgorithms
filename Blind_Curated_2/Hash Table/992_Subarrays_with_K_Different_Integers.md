Given an integer array nums and an integer k, return the number of good subarrays of nums.
A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.

Constraints:
```
1 <= nums.length <= 2 * 104
1 <= nums[i], k <= nums.length
```
Solution:
```
class Solution:
    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:
        return self.atMostK(nums, k) - self.atMostK(nums, k - 1)
        
    def atMostK(self, nums, k):
        count = collections.Counter()
        res = i = 0
        for j in range(len(nums)):
            if count[nums[j]] == 0:
                k -= 1
            count[nums[j]] += 1
            while k < 0:
                count[nums[i]] -= 1
                if count[nums[i]] == 0:
                    k += 1
                i += 1
            res += j - i + 1
        return res

# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/subarrays-with-k-different-integers/
```
