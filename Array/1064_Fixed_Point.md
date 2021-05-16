Given an array of distinct integers arr, where arr is sorted in ascending order, return the smallest index i that satisfies arr[i] == i. If there is no such index, return -1.

Example 1:
```
Input: arr = [-10,-5,0,3,7]
Output: 3
Explanation: For the given array, arr[0] = -10, arr[1] = -5, arr[2] = 0, arr[3] = 3, thus the output is 3.
```
Example 2:
```
Input: arr = [0,2,5,8,17]
Output: 0
Explanation: arr[0] = 0, thus the output is 0.
```
Example 3:
```
Input: arr = [-10,-5,3,4,7,9]
Output: -1
Explanation: There is no such i that arr[i] == i, thus the output is -1. 
```
Constraints:
```
1 <= arr.length < 104
-109 <= arr[i] <= 109
```
Solution(Python3):
```
# Binary search 0 in arr[i] - i 

class Solution:
    def fixedPoint(self, arr: List[int]) -> int:
        l, r = 0, len(arr) - 1
        while l < r:
            m = (l + r) // 2
            
            if arr[m] - m < 0: # in this case, 0 would not be searched
                l = m + 1
            else:
                r = m
                
        return l if arr[l] == l else -1
```
Follow up: The O(n) solution is very straightforward. Can we do better?
```
In the above solution, time complexity is O(logn) for binary search,
space complexity is O(1)

Link: https://leetcode.com/problems/fixed-point/
Credit: https://leetcode.com/problems/fixed-point/discuss/303401/JavaC%2B%2BPython-Binary-Search-0-in-Ai-i
```
