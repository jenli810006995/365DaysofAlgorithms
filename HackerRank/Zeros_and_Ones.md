Task

You are given the shape of the array in the form of space-separated integers, each integer representing the size of different dimensions, your task is to print an array of the given shape and integer type using the tools numpy.zeros and numpy.ones.

Input Format

A single line containing the space-separated integers.

Constraints
1 <= each integer <= 3

Output Format

First, print the array using the numpy.zeros tool and then print the array with the numpy.ones tool.

Sample Input 0
```
3 3 3
```
Sample Output 0
```
[[[0 0 0]
  [0 0 0]
  [0 0 0]]

 [[0 0 0]
  [0 0 0]
  [0 0 0]]

 [[0 0 0]
  [0 0 0]
  [0 0 0]]]
[[[1 1 1]
  [1 1 1]
  [1 1 1]]

 [[1 1 1]
  [1 1 1]
  [1 1 1]]

 [[1 1 1]
  [1 1 1]
  [1 1 1]]]
```

Solution(Python3):
```
import numpy
raw_input = tuple(map(int, input().split()))
print(numpy.zeros(raw_input, dtype = numpy.int)) # default is float
print(numpy.ones(raw_input, dtype = numpy.int)) 
```
Link: https://www.hackerrank.com/challenges/np-zeros-and-ones/problem
