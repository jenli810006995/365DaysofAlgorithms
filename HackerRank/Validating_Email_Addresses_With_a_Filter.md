Input Format

The first line of input is the integer N, the number of email addresses.
N lines follow, each containing a string.

Constraints

Each line is a non-empty string.

Sample Input
```
3
lara@hackerrank.com
brian-23@hackerrank.com
britts_54@hackerrank.com
```
Sample Output
```
['brian-23@hackerrank.com', 'britts_54@hackerrank.com', 'lara@hackerrank.com']
```

Solution(Python3):
```
import re
def fun(s):
    # return True if s is a valid email, else return False
    a = re.match(r'[a-zA-Z0-9_-]+@[a-zA-Z0-9]+\.[a-zA-Z]{1,3}$', s)
    return(a)
```
Link: https://www.hackerrank.com/challenges/validate-list-of-email-address-with-filter/problem
