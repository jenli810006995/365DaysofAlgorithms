class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        dp = [False] * (len(s) + 1)
        dp[0] = True
        for i in range(len(s)):
            if dp[i]:
                for j in range(1, len(s) + 1):
                    if s[i:j] in wordDict:
                        dp[j] = True
       return dp[-1]
       
# Link: https://leetcode.com/problems/word-break/


# for j in range(0, len(s) + 1) also works and faster. 

class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        dp = [False] * (len(s) + 1)
        dp[0] = True
        for i in range(len(s)):
            if dp[i]:
                for j in range(0, len(s) + 1):
                    if s[i:j] in wordDict:
                        dp[j] = True
        return dp[-1]
