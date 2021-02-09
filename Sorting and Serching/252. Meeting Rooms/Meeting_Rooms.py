# Sorting
# TC: O(nlongn + n)
# SC: O(1)
# n is the number of values in an array

class Solution:
    def canAttendMeetings(self, intervals: List[List[int]]) -> bool:
        intervals.sort()
        
        for i in range(len(intervals) - 1):
            if intervals[i][1] > intervals[i + 1][0]:
                return False # Overlap
        return True

# Link: https://leetcode.com/problems/meeting-rooms/
