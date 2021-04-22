You are given an array and you need to find number of tripets of indices (i, j, k) 
such that the elements at those indices are in geometric progression for a given common ratio r and i < j < k.

Example
arr = [1, 4, 16, 64]
r = 4

There are [1, 4, 16] and [4, 16, 64] at indices (0, 1, 2) and (1, 2, 3). Return 2.

Function Description

Complete the countTriplets function in the editor below.

countTriplets has the following parameter(s):

int arr[n]: an array of integers
int r: the common ratio
Returns

int: the number of triplets
Input Format

The first line contains two space-separated integers n and r, the size of arr and the common ratio.
The next line contains n space-seperated integers arr[i].

Constraints

1 <= n <= 10^5
1 <= r <= 10^9
1 <= arr[i] <= 10^9

Sample Input 0
```
4 2
1 2 2 4
```
Sample Output 0
```
2
```
Solution(Python3):
```
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countTriplets function below.
def countTriplets(arr, r):
    count = 0
    dict = {}
    dictPairs = {}
    
    for i reversed(arr):
        if i * r in dictPairs:
            count += dictPairs[i * r]
        if i * r in dict:
            dictPairs[i] = dictPairs.get(i, 0) + dict[i * r]
            
        dict[i] = dict.get(i, 0) + 1
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)

    fptr.write(str(ans) + '\n')

    fptr.close()

```

Link: https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
