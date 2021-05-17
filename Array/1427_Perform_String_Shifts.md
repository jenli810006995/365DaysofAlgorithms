You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [directioni, amounti]:
```
directioni can be 0 (for left shift) or 1 (for right shift).
amounti is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.
```

Solution(Python3):
```
classs Solution:
  def stringShift(self, s:str, shift: List[List[int]]) -> str:
      move = 0 # initialize to 0
      for x, y in shift:
          if x == 0:
              move -= y
          else:
              move += y
      move %= len(s)
      return s[-move:] + s[:-move]

# TC: O(len(s) + len(shift))
# SC: O(len(shift))
```
```
Link: https://leetcode.com/problems/perform-string-shifts/
Credit: https://leetcode.com/problems/perform-string-shifts/discuss/578648/Python-O(len(s)-%2B-len(shift))
```
