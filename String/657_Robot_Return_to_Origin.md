There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

Solution(Python3):
```
class Solution:
    def judgeCircle(self, moves: str) -> bool:
        """
        :type moves: str
        :rtype: bool
        """
        # check the number of U == D and R == L
        if not moves:
            return True
        if moves.count('U') == moves.count('D') and moves.count('L') == moves.count('R'):
            return True
        else:
            return False

# TC: O(n), n is the length of the moves, we iterate through the entire array
# SC: O(1)

```
```
Link: https://leetcode.com/problems/robot-return-to-origin/
```
