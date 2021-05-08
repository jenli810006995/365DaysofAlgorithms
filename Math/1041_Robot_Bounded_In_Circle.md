On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
```
"G": go straight 1 unit;
"L": turn 90 degrees to the left;
"R": turn 90 degrees to the right.
```
The robot performs the instructions given in order, and repeats them forever.

Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.

Solution(Python3):
```
class Solution:
    def isRobotBounded(self, instructions: str) -> bool:
        # north = 0, east = 1, south = 2, west = 3
        
        directions = [[0, 1], [1, 0], [0, -1], [-1, 0]]
        
        # Initial position is in the center
        x = y = 0
        # facing north
        idx = 0
        
        for i in instructions:
            if i == "L":
                idx = (idx + 3) % 4
            elif i == "R":
                idx = (idx + 1) % 4
            else:
                x += directions[idx][0]
                y += directions[idx][1]
                
        # after one cycle:
        # robot returns into initial position
        # or robot does not face north
        
        return (x == 0 and y == 0) or idx != 0
        
```
Link: https://leetcode.com/problems/robot-bounded-in-circle/
