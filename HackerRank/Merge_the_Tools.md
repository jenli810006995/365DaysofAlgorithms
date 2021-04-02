Consider the following:

A string, s, of length n where s = c0 c1 c2...cn-1.
An integer,k , where k is a factor of n.
We can split s into n/k substrings where each subtring, ti, consists of a contiguous block of k characters in s. Then, use each ti to create string ui such that:

The characters in ui are a subsequence of the characters in ti.
Any repeat occurrence of a character is removed from the string such that each character in ui occurs exactly once. 
In other words, if the character at some index j in ti occurs at a previous index <j in ti, then do not include the character in string ui.
Given s and k, print n/k lines where each line i denotes string ui.

Example
s = 'AAABCADDE'
k = 3

There are three substrings of length 3 to consider: 'AAA', 'BCA' and 'DDE'. The first substring is all 'A' characters, so u1 = 'A'. 
The second substring has all distinct characters, so u2 = 'BCA'. 
The third substring has 2 different characters, so u3 = 'DE'. 
Note that a subsequence maintains the original order of characters encountered. The order of characters in each subsequence shown is important.

Function Description

Complete the merge_the_tools function in the editor below.

merge_the_tools has the following parameters:

string s: the string to analyze
int k: the size of substrings to analyze

Prints

Print each subsequence on a new line. There will be n/k of them. No return value is expected.

Input Format

The first line contains a single string, s.
The second line contains an integer, k, the length of each substring.

Constraints
1 <= n <= 10^4, where n is the length of s
1 <= k <= n
It is guaranteed that n is a multiple of k.

Solution:
```
def merge_the_tools(string, k):
    while string: # while string is not None
        seen = ''
        s = string[0:k]
        for c in s:
            if c not in seen:
                seen += c
        print(seen)
        string = string[k:]
        
if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
```

Link: https://www.hackerrank.com/challenges/merge-the-tools/problem
