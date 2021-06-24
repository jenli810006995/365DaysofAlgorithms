Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Solution(Python3):
```
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s: # each letter in s
                count[ord(c) - ord('a')] += 1
            ans[tuple(count)].append(s)
        return ans.values()
                
# TC: O(nklogk), n is the length of the strs, k is the maximun length of a string in strs
# SC: O(nk)
```
```
Link: https://leetcode.com/problems/group-anagrams/
```
