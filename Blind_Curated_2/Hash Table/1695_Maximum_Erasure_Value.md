You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.
```
An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
```

Constraints:
```
1 <= nums.length <= 105
1 <= nums[i] <= 104
```

Solution:
```
class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        beg, end, S, n, sm = 0, 0, set(), len(nums), 0
        ans = 0
        while end < n:
            if nums[end] not in S:
                sm += nums[end]
                S.add(nums[end])
                end += 1
                ans = max(ans, sm)
            else:
                sm -= nums[beg]
                S.remove(nums[beg])
                beg += 1
        return ans

# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/maximum-erasure-value/
```
