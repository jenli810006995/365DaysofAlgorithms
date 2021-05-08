You are given a list of songs where the ith song has a duration of time[i] seconds.

Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.

Solution(Python3):
```
class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        remainders = collections.defaultdict(int)
        ret = 0
        for t in time:
            if t % 60 == 0: # check if a % 60 == 0 && b % 60 == 0
                ret += remainders[0]
            else:
                # check if a % 60 + b % 60 == 60
                ret += remainders[t - t % 60]
            remainders[t % 60] += 1 # to update the remainders
        return ret
```
Link: https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
