Task
The students of District College have subscriptions to English and French newspapers. Some students have subscribed only to English, some have subscribed only to French, and some have subscribed to both newspapers.

You are given two sets of student roll numbers. One set has subscribed to the English newspaper, one set has subscribed to the French newspaper. Your task is to find the total number of students who have subscribed to both newspapers.

Constraints

0 < total # of student in college < 1000

Sample Input

```
9
1 2 3 4 5 6 7 8 9
9
10 1 2 3 11 21 55 6 8
```
Sample Output
```
5
```
Solution(Python3):
```
_, a = input(), set(input().split()) # bc the first input is always the count of the input numbers, which is not what we want
_, b = input(), set(input().split())

print(len(a.intersection(b)))
```
Link: https://www.hackerrank.com/challenges/py-set-intersection-operation/problem
