Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
```
0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
```

Constraints:
```
n == nums1.length
n == nums2.length
n == nums3.length
n == nums4.length
1 <= n <= 200
-228 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 228
```
Solution:
```
class Solution:
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        nums1nums2 = collections.Counter(a + b for a in nums1 for b in nums2)
        return sum(nums1nums2[-c-d] for c in nums3 for d in nums4)

# TC: O(n^2)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/4sum-ii/
```
