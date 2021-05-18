Given an array of integers A, return the largest integer that only occurs once.

If no integer occurs once, return -1.

Example 1:
```
Input: [5,7,3,9,4,9,8,3,1]
Output: 8
Explanation: 
The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it's the answer.
```
Example 2:
```
Input: [9,9,8,8]
Output: -1
Explanation: 
There is no number that occurs only once.
``` 

Note:
```
1 <= A.length <= 2000
0 <= A[i] <= 1000
```
Solution(Python3):
```
class Solution:
  def largestUniqueNumber(self, A: List[int]) -> int:
      # use collections.Counter
      return max((k for k, v in collections.Counter(A).items() if v == 1), default = -1)
# TC: O(N) becoz it is a dictionary
# SC: O(N) the worst case we would have to store all the numbers with freq as 1
```
```
Link: https://leetcode.com/problems/largest-unique-number/
Credit: https://leetcode.com/problems/largest-unique-number/discuss/344834/Python-3-One-liner
