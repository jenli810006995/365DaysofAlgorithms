Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
You may assume that the intervals were initially sorted according to their start times.

Constraints:
```
0 <= intervals.length <= 104
intervals[i].length == 2
0 <= intervals[i][0] <= intervals[i][1] <= 105
intervals is sorted by intervals[i][0] in ascending order.
newInterval.length == 2
0 <= newInterval[0] <= newInterval[1] <= 105
```
Solution(Python3):
```
class Solution:
    def insert(self, intervals, newInterval):
        # collect the intervals strictly left or right of the new interval, merge the new one with the middle ones(if any) before inserting it b/w left and right ones
        s, e = newInterval.start, newInterval.end
        left = [i for i in intervals if i.end < s]
        right = [i for i in intervals if i.start > e]
        
        if left + right != intervals:
            s = min(s, intervals[len(left)].start)
            e = max(e, intervals[~len(right)].end)
        return left + [Intervals[s, e]] + right

# TC: O(n), from left and right until the middle
# SC: O(n)

```
```
Link: https://leetcode.com/problems/insert-interval/
```
