Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Solution(Python3):
```
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ret = []
        self.dfs(nums, [], ret)
        return ret
        
    def dfs(self, nums, path, ret):
        ret.append(path)
        for i in range(len(nums)):
            self.dfs(nums[i+1:], path+[nums[i]], ret)
            
# Bit manipulation

class Solution:
    def subset2(self, nums):
        res = []
        nums.sort()
        for i in range(1<<len(nums)):
            tmp = []
            for j in range(len(nums)):
                if i & 1 << j:
                    tmp.append(nums[j])
            res.append(tmp)
        return res

# Iteratively

class Solution:
    def subsets(self, nums):
        res = [[]]
        for num in sorted(nums):
            res += [item+[num] for item in res]
        return res

# TC: O(N * 2^N), for a given number, it could be present or absent(binary option) in a subset problem. as a result, for N numbers, we have 2^N choices.
# SC: O(N * 2^N)

```
```
Link: https://leetcode.com/problems/subsets/
```
