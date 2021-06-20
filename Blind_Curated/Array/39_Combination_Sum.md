Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. 
You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. 
Two combinations are unique if the frequency of at least one of the chosen numbers is different.
It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Solution(Python3):
```
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ret = []
        self.dfs(candidates, target, [], ret)
        return ret
        
    def dfs(self, nums, target, path, ret):
        if target < 0:
            return
        if target == 0:
            ret.append(path)
        for i in range(len(nums)):
            self.dfs(nums[i:], target - nums[i], path+[nums[i]], ret)

# TC: O(N^(T/M+1)), N be the number of candidate, T is the target value, M is the minimum value among the candidates
# SC: O(T/M)
```
```
Link: https://leetcode.com/problems/combination-sum/
```
