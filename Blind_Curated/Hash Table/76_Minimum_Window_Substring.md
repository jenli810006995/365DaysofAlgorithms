Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

Constraints:
```
m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
``` 
Follow up: Could you find an algorithm that runs in O(m + n) time?

Slution(Python3):
```
class Solution:
    def minWindow(self, s: str, t: str) -> str:
        need, missing = collections.Counter(t), len(t) # total number of char we care about        
        i = start= end = 0
        for j, c in enumerate(s, 1): # index j from 1
            if need[c] > 0:
                missing -= 1
            need[c] -= 1
            if missing == 0: # matching completely
                while i < j and need[s[i]] < 0:
                    need[s[i]] += 1
                    i += 1
                need[s[i]] += 1 # make sure the first apprearing char satisfy the need[char] > 0 
                missing += 1 # we missed the first char, so add missing by 1
                if end == 0 or j - i < end - start: # update window
                    start, end = i, j
                i += 1
        return s[start: end]

# TC: O(m + n) # not quite sure
# SC: O(1)
```
```
Link: https://leetcode.com/problems/minimum-window-substring/
```
