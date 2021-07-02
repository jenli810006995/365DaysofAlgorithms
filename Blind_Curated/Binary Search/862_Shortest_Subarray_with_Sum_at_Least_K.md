Return the length of the shortest, non-empty, contiguous subarray of nums with sum at least k.

If there is no non-empty subarray with sum at least k, return -1.

Note:
```
1 <= nums.length <= 50000
-105 <= nums[i] <= 105
1 <= k <= 109
```

Solution(Python3):
```
class Solution:
    def shortestSubarray(self, nums, k):
        d = collections.deque([[0,0]])
        res, cur = float('inf'), 0
        for i, a in enumerate(nums):
            cur += a
            while d and cur - d[0][1] >= k:
                res = min(res, i + 1 - d.popleft()[0])
            while d and cur <= d[-1][1]:
                d.pop()
            d.append([i + 1, cur])
            
        return res if res < float('inf') else -1
                
                
# TC: O(n)
# SC: O(n)

```
```
Link: https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
```
