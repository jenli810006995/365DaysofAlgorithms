n, m = input().split()
sc_ar = input().split() # this is a list, since the array might contain duplicated elements

A = set(input().split())
B = set(input().split())

print(sum([(i in A) - (i in B) for i in sc_ar]))

Link: https://www.hackerrank.com/challenges/no-idea/problem
