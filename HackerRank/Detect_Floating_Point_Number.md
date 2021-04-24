You are given a string N.
Your task is to verify that N is a floating point number.

Solution(Python3):
```
import re

for _ in range(int(input())):
    print(bool(re.match(r'^[-+]?[0-9]*\.[0-9]+$', input())))
```
Link: https://www.hackerrank.com/challenges/introduction-to-regex/problem
