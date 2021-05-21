Given a sorted integer array nums and three integers a, b and c, apply a quadratic function of the form f(x) = ax2 + bx + c to each element nums[i] in the array, and return the array in a sorted order.

Example 1:
```
Input: nums = [-4,-2,2,4], a = 1, b = 3, c = 5
Output: [3,9,15,33]
```
Example 2:
```
Input: nums = [-4,-2,2,4], a = -1, b = 3, c = 5
Output: [-23,-5,1,7]
``` 
Constraints:
```
1 <= nums.length <= 200
-100 <= nums[i], a, b, c <= 100
nums is sorted in ascending order.
```
Solution(Python3):
```
class Solution:
  def sortTransformedArray(self, nums: List[int], a: int, b: int, c: int) -> List[int]:
      nums = [x*x*x + x*b + c for x in nums]
      ret = [0] * len(nums)
      p1, p2 = 0, len(nums) - 1
      i, d = (p1, 1) if a < 0 else (p2, -1)
      while p1 <= p2:
          if nums[p1] * -d > nums[p2] * -d:
              ret[i] = nums[p1]
              p1 += 1
          else:
              ret[i] = nums[p2]
              p2 -= 1
          i += d
      return ret 

# TC: O(n), becoz two pointers traverse the array just once
# SC: O(n)
```

```
Link: https://leetcode.com/problems/sort-transformed-array/
Credit: https://leetcode.com/problems/sort-transformed-array/discuss/83331/Python-O(n)-Two-Pointers-Solution
```
