Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:
```
Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.
In other words, we treat '(' as openning parenthesis and '))' as closing parenthesis.

For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.

You can insert the characters '(' and ')' at any position of the string to balance it if needed.
```
Return the minimum number of insertions needed to make s balanced.

Solution(Python3):
```
class Solution:
  def minInsertions(self, s: str) -> int:
      res = right = 0
      for c in s:
          if c == '(':
              if right % 2:
                  right -= 1
                  res += 2
              right += 2 # otherwise, we add a pair of right
          if c == ')':
              right -= 1
              if right < 0:
                  right += 2
                  res += 1
      return right + res
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
```
