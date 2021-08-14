Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Constraints:
```
1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
```

Solution:
```
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        # create a dictionary and use enumerate
        dic = {}
        for i, num in enumerate(nums):
            if num in dic and i - dic[num] <= k: # the question was asking abs(i - j) <= k
                return True
            dic[num] = i
        return False
# TC: O(n), since each node is visited once
# SC: O(n)
```
```
Link: https://leetcode.com/problems/contains-duplicate-ii/
```
