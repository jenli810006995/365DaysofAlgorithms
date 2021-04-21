Given two strings, determine if they share a common substring. A substring may be as small as one character.

Example

s1 = 'and'
s2 = 'art'

These share the common substring .
s1 = 'be'
s2 = 'cat'

These do not share a substring.

Function Description

Complete the function twoStrings in the editor below.

twoStrings has the following parameter(s):

string s1: a string
string s2: another string

Returns
string: either YES or NO

Input Format

The first line contains a single integer p, the number of test cases.

The following p pairs of lines are as follows:

The first line contains string s1.
The second line contains string s2.

Constraints

s1 and s2 consist of characters in the range ascii[a-z].
1 <= p <= 10
1 <= |s1|, |s2| <= 10^5

Output Format

For each pair of strings, return YES or NO.

Sample Input
```
2
hello
world
hi
world
```
Sample Output
```
YES
NO
```

Solution(Python3):
```
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the twoStrings function below.
def twoStrings(s1, s2):
    return 'YES' if set(s1) & set(s2) else 'NO'
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s1 = input()

        s2 = input()

        result = twoStrings(s1, s2)

        fptr.write(result + '\n')

    fptr.close()
```

Link: https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
