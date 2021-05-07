You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.

There are two types of logs:
```
Letter-logs: All words (except the identifier) consist of lowercase English letters.
Digit-logs: All words (except the identifier) consist of digits.
Reorder these logs so that:

The letter-logs come before all digit-logs.
The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
The digit-logs maintain their relative ordering.
Return the final order of the logs.
```

Solution(Python3):
```
class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        def get_key(log):
            _id, rest = log.split(' ', maxsplit = 1)
            return (0, rest, _id) if rest[0].isalpha() else (1, )
        return sorted(logs, key = get_key)
        
# N is the number of logs in the list
# M is the maximum length of a single log
# TC: O(MNlogN)
# SC: O(M*N)
```
Link: https://leetcode.com/problems/reorder-data-in-log-files/
