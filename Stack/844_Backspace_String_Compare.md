Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:
```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
```
Example 2:
```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
```
Example 3:
```
Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".
```
Example 4:
```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
``` 
Constraints:
```
1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
```

Solution(Python3):
```
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        # stack approach
        def build(s):
            ans = []
            for c in s:
                if c != '#':
                    ans.append(c)
                elif ans:
                    ans.pop() # remove and return the last value from the list or the given index value
            return "".join(ans)
        return build(s) == build(t)
# TC: O(m+n), m, n are the length of s and t
# SC: O(m+n)
```
Follow up: Can you solve it in O(n) time and O(1) space?
Use two pointers as below

Solution(Python3):
```
class Solution:
    def backspaceCompare(self, s, t):
        def F(s):
            skip = 0
            for x in reversed(s):
                if x == '#':
                    skip += 1
                elif skip:
                    skip -= 1
                else:
                    yield x # yield returns a generator to the caller and the execution only starts when the generator is iterated. 
                            # Yield is best when we want the execution to be faster
         return all(x == y for x, y in itertools.zip_longest(F(s), F(t)))
         
# TC: O(m + n)
# SC: O(1)
```

```
Link: https://leetcode.com/problems/backspace-string-compare/
Python itertools.zip_longest: https://www.geeksforgeeks.org/python-itertools-zip_longest/
