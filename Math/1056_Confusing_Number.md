Given a number n, return true if and only if it is a confusing number, which satisfies the following condition:

We can rotate digits by 180 degrees to form new digits. When 0, 1, 6, 8, 9 are rotated 180 degrees, 
they become 0, 1, 9, 8, 6 respectively. When 2, 3, 4, 5 and 7 are rotated 180 degrees, they become invalid. 
A confusing number is a number that when rotated 180 degrees becomes a different number with each digit valid.

Solution(Python3):
```
class Solution:
  def confusingNumber(self, n: int) -> bool:
      S = str(n)
      rotation = {"0":"0", "1": "1", "6": "9", "8":"8", "9":"6"}
      result = []
      
      for c in S[::-1]: # iterate in reverse
          if c not in rotation:
              return False
          result.append(rotation[c])
      return "".join(result) != S

# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/confusing-number/
Credit: https://leetcode.com/problems/confusing-number/discuss/303636/Python-map-each-digit-to-its-rotation
```
