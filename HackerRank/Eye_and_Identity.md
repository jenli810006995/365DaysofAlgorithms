Task

Your task is to print an array of size N X M with its main diagonal elements as 1's and 0's everywhere else.

Note

In order to get alignment correct, please insert the line np.set_printoptions(legacy = '1.13') below the numpy import.

Input Format

A single line containing the space separated values of N and M.
N denotes the rows.
M denotes the columns.

Output Format

Print the desired N X M array.

Sample Input

```
3 3
```
Sample Output
```
[[ 1.  0.  0.]
 [ 0.  1.  0.]
 [ 0.  0.  1.]]
 ```
 
 Solution(Python3):
 ```
 import numpy
 np.set_printoptions(legacy = '1.13')
 print(str(numpy.eye(*map(int, input().split()))).replace('1',' 1').replace('0', ' 0'))

 ```
 
 Link: https://www.hackerrank.com/challenges/np-eye-and-identity/problem
