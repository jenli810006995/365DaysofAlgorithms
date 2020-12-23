class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        N = len(nums)
        
        ## set i, j as negative and positive parts
        j = 0
        while j < N and nums[j] < 0: ## nums[j] is negative
            j += 1
        i = j - 1
        
        ans = []
        while 0 <= i and j < N:
            if nums[i] ** 2 < nums[j] ** 2:
                ans.append(nums[i] ** 2)
                i -= 1
            else:
                ans.append(nums[j] ** 2)
                j += 1
                
        while i >= 0:
            ans.append(nums[i] **2)
            i -= 1
       
        while j < N:
            ans.append(nums[j] **2)
            j += 1
           
        return ans
    
    ## Link: https://leetcode.com/problems/squares-of-a-sorted-array/
