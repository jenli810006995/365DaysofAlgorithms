A newly opened multinational brand has decided to base their company logo on the three most common characters in the company name. 
They are now trying out various combinations of company names and logos based on this condition. 
Given a string S, which is the company name in lowercase letters, your task is to find the top three most common characters in the string.

Print the three most common characters along with their occurrence count.
Sort in descending order of occurrence count.
If the occurrence count is the same, sort the characters in alphabetical order.
For example, according to the conditions described above,

GOOGLE would have it's logo with the letters G, O, L, E.

Input Format

A single line of input containing the string S.

Constraints
3 < len(S) <= 10^4
S has at least 3 distinct characters

Solution(Python 3):
```
import math
import os
import random
import re
import sys
from collections import Counter

chars = Counter(input()).items()

for char, n in sorted(chars, key = lambda c: (-c[1], c[0]))[:3]:
    print(char, n)
```
Link: https://www.hackerrank.com/challenges/most-commons/problem
