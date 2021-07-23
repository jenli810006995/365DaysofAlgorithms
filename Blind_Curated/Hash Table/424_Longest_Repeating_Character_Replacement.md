You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

Constraints:
```
1 <= s.length <= 105
s consists of only uppercase English letters.
0 <= k <= s.length
```
Solution:
```
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxf = i = 0
        count = collections.Counter()
        for j in range(len(s)):
            count[s[j]] += 1
            maxf = max(maxf, count[s[j]])
            if j - i + 1 > maxf + k:
                count[s[i]] -= 1
                i += 1
        return len(s) - i
        
# TC: O(n)
# SC: O(26)
```
```
Link: https://leetcode.com/problems/longest-repeating-character-replacement/
```
