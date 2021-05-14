Given an array nums sorted in non-decreasing order, and a number target, return True if and only if target is a majority element.

A majority element is an element that appears more than N/2 times in an array of length N.

Example 1:
```
Input: nums = [2,4,5,5,5,5,5,6,6], target = 5
Output: true
Explanation: 
The value 5 appears 5 times and the length of the array is 9.
Thus, 5 is a majority element because 5 > 9/2 is true.
```
Example 2:
```
Input: nums = [10,100,101,101], target = 101
Output: false
Explanation: 
The value 101 appears 2 times and the length of the array is 4.
Thus, 101 is not a majority element because 2 > 4/2 is false.
``` 
Constraints:
```
1 <= nums.length <= 1000
1 <= nums[i] <= 10^9
1 <= target <= 10^9
```
Solution:
```
class Solution:
  def isMajorityElement(self, nums: List[int], target: int) -> bool:
      
      ans = 0 # we initiated an empty array, and iterate over nums. each time the element in nums the same as target
              # we increment ans. if ans happen to be greater than N/2, return True
              
      N = len(nums)
      
      for i in range(N):
          if nums[i] == target:
              ans += 1
      if ans > N/2:
          return True
      else:
          return False
```
TC: O(N)
SC: O(1)

Link: https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/
