Task
The provided code stub reads and integer,n, from STDIN. For all non-negative integers i < n, print i^2.

Example

The list of non-negative integers that are less than n is i. Print the square of each number on a separate line.
```
0
1
4
```
Input Format

The first and only line contains the integer, n.

```
Constraints

1 <= n <= 20

```
Output Format

Print n lines, one corresponding to each i.

Solution:
```
if __name__ == '__main__':
    n = int(input())
    i = 0
    while i < n:
        print(i **2)
        i += 1

```
Link: https://www.hackerrank.com/challenges/python-loops/problem
