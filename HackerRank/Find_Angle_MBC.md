Input Format

The first line contains the length of side AB.
The second line contains the length of side BC.

Constraints

0 < AB <= 100
0 < BC <= 100

Lengths AB and BC are natural numbers.

Output Format

Output angle MBC in degrees.

Note: Round the angle to the nearest integer.

Solution(Python 3):
```
import math
AB = int(input())
BC = int(input())

print(str(int(round(math.degrees(math.atan2(AB, BC)))))+'°')

```
Link: https://www.hackerrank.com/challenges/find-angle/problem
