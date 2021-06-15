Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
```
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
```
Constraints:
```
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
```

Solution(Python3):
```
class Solution:
    def isValid(self, s):
        stack = []
        dict = {"]":"[", "}":"{", ")":"("}
        for char in s:
            if char in dict.values():
                stack.append(char)
            elif char in dict.keys():
                if stack == [] or dict[char] != stakc.pop():
                    return False
            else:
                return False
        return stack == []
                
 # TC: O(n), we traverse the given string one character at a time, and operate and pop on a stack takes O(1) time
 # SC: O(n)

```
```
Link: https://leetcode.com/problems/valid-parentheses/
```
