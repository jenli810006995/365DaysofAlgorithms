Task
Given an integer, n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5 , print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Constraints

1 <= n <= 100

Solution(Python 3):
```
#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    n = int(input().strip())
    if n >= 1 and n <= 100:
        if n % 2 != 0:
            print('Weird')
        else:
            if 2 <= n and n <= 5:
                print('Not Weird')
            elif 6 <= n and n <= 20:
                print('Weird')
            else:
                print('Not Weird')
                
```
Link: https://www.hackerrank.com/challenges/py-if-else/problem
