Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. If there are duplicates in arr, count them separately.

Solution(Python3):
```
class Solution:
  def countElements(self, arr: List[int]) -> int:
      C = collections.Counter(arr)
      return sum(C[x] for x in C if x + 1 in C)
      
# TC: O(N)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/counting-elements/
Credit: https://leetcode.com/problems/counting-elements/discuss/567310/Python-in-2-lines
```
