Input Format

The first line contains an integer N. N is the total number of integers in the list.
The second line contains the space separated list of N integers.

Constraints
0 < N < 100

Output Format

Print True if all the conditions of the problem statement are satisfied. Otherwise, print False.

Sample Input
```
5
12 9 61 5 14 
```
Sample Output
```
True
```
Solution(Python3):
```
N = int(input())
integers = input().split()
if all(int(i) >= 0 for i in integers): # all positive integers
    if any(num == num[-1:] for num in integers):
        print('True')
    else:
        print('False')
else:
    print('False')
```
Link: https://www.hackerrank.com/challenges/any-or-all/problem
