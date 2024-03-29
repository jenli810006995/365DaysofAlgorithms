Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

Constraints:
```
1 <= s.length <= 1000
s consists of lowercase English letters.
```

Solution:
```
class Solution:
    def countSubstrings(self, s: str) -> int:
        n = len(s)
        ans = 0
        for center in range(2*n - 1):
            left = center // 2
            right = left + center % 2
            while left >= 0 and right < n and s[left] == s[right]:
                ans += 1
                left -= 1
                right += 1
        return ans
# TC: O(n^2)
# SC: O(1)
```
Bonus: Implementing Manchaners Algorithm can give a linear time
```
class Solution:
    def countSubstrings(self, S):
        def manachers(S):
            A = '@#' + '#'.join(S) + '#S'
            Z = [0] * len(A)
            center = right = 0
            for i in range(1, len(A) - 1):
                if i < right:
                    Z[i] = min(right - i, Z[2 * center - i])
                while A[i + Z[i] + 1] == A[i - Z[i] - 1]:
                    Z[i] += 1
                if i + Z[i] > right:
                    center, right = i, i + Z[i]
                    
            return Z
        return sum((v + 1)//2 for v in manachers(S))

# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/palindromic-substrings/
```

