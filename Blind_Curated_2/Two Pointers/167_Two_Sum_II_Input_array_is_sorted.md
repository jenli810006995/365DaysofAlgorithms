Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Constraints:
```
2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
```
The tests are generated such that there is exactly one solution.

Solution:
```
class Solution:
    def twoSum(self, numbers, target):
        # create an empty hash table
        dic = {}
        for i, num in enumerate(numbers):
            if target - num in dic: # means we found it
                # return its index
                return [dic[target - num] + 1, i + 1]
            # else, add it to the dic
            dic[num] = i

# TC: O(n)
# SC: O(n)

```
```
Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
```
