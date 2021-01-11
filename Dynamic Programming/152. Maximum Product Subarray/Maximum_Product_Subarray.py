class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        
        curMax, curMin = 1, 1 # 1 is the neutural value instead of 0
        for n in nums:
            tmp = curMax * n
            curMax = max(curMax * n, curMin * n, n)
            curMin = min(tmp, curMin * n, n)
            res = max(res, curMax)
            
        return res
        
  // Link: https://leetcode.com/problems/maximum-product-subarray/
