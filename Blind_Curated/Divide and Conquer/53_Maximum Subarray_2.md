Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Constraints:
```
1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105
``` 
Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Solution(Divide and Conquer):
```
class Solution:
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def divide_and_conquer(nums, i, j):
            if i == j - 1:
                return nums[i], nums[i], nums[i], nums[i]
                
            # we will compute :
            # a which is max contiguous sum in nums[i:j] including the first value
            # m which is max contiguous sum in nums[i:j] anywhere 
            # b which is max contiguous sum in nums[i:j] including the last value
            # s which is the sum of all values in nums[i:j]
            
            # compute middle index to divide array in two halves
            i_mid = i + (j - i)//2
            
            # compute a, m, b, s for left half
            a1, m1, b1, s1 = divide_and_conquer(nums, i, i_mid)
            
            # compute a, m, b, s for right half
            a2, m2, b2, s2 = divide_and_conquer(nums, i_mid, j)
            
            # combine a, m, b, s values from left and right halves to form a, m, b, s for whole array (bottom up)
            a = max(a1, s1 + a2)
            b = max(b2, s2 + b1)
            m = max(m1, m2, b1 + a2)
            s = s1 + s2
            return a, m, b, s
            
            _.m._._ = divide_and_conquer(nums, 0, len(nums))
            return m
            
# TC: O(nlogn), n is the length of nums
# SC: O(logn)
```
```
Link: https://leetcode.com/problems/maximum-subarray/
```
