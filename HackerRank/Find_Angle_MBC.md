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

Solution(Python3):
```
import math
AB = int(raw_input())
BC = int(raw_input())
hype = math.hypot(AB, BC) # to calculate hypotenuse, In geometry, a hypotenuse is the longest side of a right-angled triangle, the side opposite the right angle. 
res = round(math.degrees(math.acos(BC/hype))) # to cal required angle
degree = chr(176)
print(res, degree, sep = '')

```

Link: https://www.hackerrank.com/challenges/find-angle/problem
