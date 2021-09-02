Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

Example 1:
```
Input: nums = [1,1,1], k = 2
Output: 2
```
Example 2:
```
Input: nums = [1,2,3], k = 3
Output: 2
``` 
Constraints:
```
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
```

Solution:
```
class Solution:
  def subarraySum(self, nums: List[int], k: int) -> int:
      # initialize parameters
      count = 0
      Mysum = 0
      MyHashMap = dict()
      MyHashMap[0] = 1 
      for i in range(0, len(nums)):
          Mysum += nums[i]
          if Mysum - k in MyHashMap:
              count += MyHashMap[Mysum - k]
          MyHashMap[Mysum] = MyHashMap.get(Mysum, 0) + 1
      return count
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/subarray-sum-equals-k/
```
