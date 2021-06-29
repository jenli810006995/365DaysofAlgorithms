Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Constraints:
```
1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
```
Solution(Python3):
```
class Solution:
    # sorting
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key = lambda x: x[0])
        
        merged = []
        for interval in intervals:
            # if the list of merged intervals is empty or if the current interval
            # does not overlap with the previous, simply append it
            if not mergerd or if merged[-1][1] < interval[0]:
                merged.append(interval)
                
            else:
                # otherwise, there is an overlap. so we merge the current and the previous intervals
                merged[-1][1] = max(merged[-1][1], interval[1])
                
        return merged
        
# TC: O(nlogn)
# SC: O(logn) or O(n), see if we could sort the interval in place

```
```
Link: https://leetcode.com/problems/merge-intervals/
```
