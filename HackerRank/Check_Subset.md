You are given two sets, A and B.
Your job is to find whether set A is a subset of set B.

If set A is subset of set B, print True.
If set A is not a subset of set B, print False.

Input Format

The first line will contain the number of test cases, T.
The first line of each test case contains the number of elements in set A.
The second line of each test case contains the space separated elements of set A.
The third line of each test case contains the number of elements in set B.
The fourth line of each test case contains the space separated elements of set B.

Constraints
```
0 < T < 21
0 < Number of elements in each set < 1001
```
Solution(Python3):
```
for _ in range(int(input())):
    x, a, y, b = input(), set(input().split()), input(), set(input().split())
    print(a.issubset(b))
```
Link: https://www.hackerrank.com/challenges/py-check-subset/problem

