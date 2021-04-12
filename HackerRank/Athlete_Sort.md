Input Format

The first line contains N and M separated by a space.
The next N lines each contain M elements.
The last line contains K.

Constraints

1 <= N, M <= 1000
0 <= K < M
Each element <= 1000 

Output Format

Print the N lines of the sorted table. Each line should contain the space separated elements. Check the sample below for clarity.

Sample Input 0
```
5 3
10 2 5
7 1 0
9 9 9
1 23 12
6 5 9
1
```
Sample Output 0
```
7 1 0
10 2 5
6 5 9
9 9 9
1 23 12
```
Solution(Python3):
```
#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    N, M = map(int, input().split())
    rows = [input() for _ in range(N)]
    K = int(input())
    
    for row in sorted(rows, key = lambda row: int(row.split()[K])):
        print(row)
```
Link: https://www.hackerrank.com/challenges/python-sort-sort/problem
