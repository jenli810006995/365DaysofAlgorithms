Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. 
Given a string, find the number of pairs of substrings of the string that are anagrams of each other.

Function Description

Complete the function sherlockAndAnagrams in the editor below.

sherlockAndAnagrams has the following parameter(s):

string s: a string
Returns

int: the number of unordered anagrammatic pairs of substrings in s
Input Format

The first line contains an integer q, the number of queries.
Each of the next q lines contains a string s to analyze.

Constraints

1 <= q <= 10
2 <= length of s <= 100

s contains only lowercase letters in the range ascii[a-z].

Sample Input 0
```
2
abba
abcd
```
Sample Output 0
```
4
0
```

Solution(Python3):
```
#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# Complete the sherlockAndAnagrams function below.
def sherlockAndAnagrams(s):
    buckets = {}
    for i in range(len(s)):
        for j in range(1, len(s) - i +1):
            key = frozenset(Counter(s[i:i+j]).items())
            buckets[key] = buckets.get(key, 0) + 1
    count = 0
    for key in buckets:
        count += buckets[key] * (buckets[key] - 1)//2
    return count
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

```
Link: https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps&h_r=next-challenge&h_v=zen
