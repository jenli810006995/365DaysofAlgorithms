TASK

You are given a set A and N number of other sets. These number of sets have to perform some specific mutation operations on set A.
Your task is to execute those operations and print the sum of elements from set .

Input Format

The first line contains the number of elements in set A.
The second line contains the space separated list of elements in set A.
The third line contains integer N, the number of other sets.
The next 2* N lines are divided into parts containing two lines each N.
The first line of each part contains the space separated entries of the operation name and the length of the other set.
The second line of each part contains space separated list of elements in the other set.

0 < len(set(A)) < 1000 
0 < len(otherSets) < 100
0 < N < 100

Output Format
Output the sum of elements in set A.

Solution(Python 3):
```
s = set(input().split())
for _ in range(int(input())):
    command, *args = input().split()
    getattr(s, command)(set(intput().split()))
print(sum(map(int, s)))
```
Link: https://www.hackerrank.com/challenges/py-set-mutations/problem
