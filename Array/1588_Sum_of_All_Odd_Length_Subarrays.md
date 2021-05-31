Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

Constraints:
```
1 <= arr.length <= 100
1 <= arr[i] <= 1000
```
Solution(Python3):
```
class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        res, n = 0, len(arr)
        for i, a in enumerate(arr):
            res += ((i + 1)*(n - i) + 1)//2 * a
        return res
        
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        return sum(((i + 1)*(len(arr) - i)+ 1)//2 * a for i, a in enumerate(arr))
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
```
