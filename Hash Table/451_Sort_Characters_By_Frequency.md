Given a string s, sort it in decreasing order based on the frequency of characters, and return the sorted string.

Example 1:
```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
```
Example 2:
```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
```
Example 3:
```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
``` 
Constraints:
```
1 <= s.length <= 5 * 105
s consists of English letters and digits.
```

Solution(Python3):
```
class Solution:
    def frequencySort(self, s: str) -> str:
        if not s: return s
        
        # Convert s to a list
        s = list(s)
        
        # Sort the characters in s
        s.sort()
        
        # Make a list of strings, one for each unique chars
        all_strings = []
        cur_sb = [s[0]]
        for c in s[1:]:
            # If the last character in String Builder is different
            if cur_sb[-1] != c:
                all_strings.append("".join(cur_sb))
                cur_sb = []
            cur_sb.append(c)
        all_strings.append("".join(cur_sb))
        
        # Sort the string by length from *longest* to shortest
        all_strings.sort(key = lambda string: len(string), reverse = True)
        
        # Convert to a single string to return
        
        return "".join(all_strings)
        
# TC: O(nlongn)
# SC: O(n)

```

```
Link: https://leetcode.com/problems/sort-characters-by-frequency/
```
