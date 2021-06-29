Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Constraints:
```
1 <= intervals.length <= 2 * 104
intervals[i].length == 2
-2 * 104 <= starti < endi <= 2 * 104
```
Solution(Python3):
```
class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        end, cnt = float('-inf'), 0
        
        for s, e in sorted(intervals, key = lambda x: x[1]):
            if s >= end:
                end = e
                
            else:
                cnt += 1
        return cnt
        
# TC: O(nlogn)
# SC: O(1)

```
```
Link: https://leetcode.com/problems/non-overlapping-intervals/solution/
```
