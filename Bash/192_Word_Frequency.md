Write a bash script to calculate the frequency of each word in a text file words.txt.

For simplicity sake, you may assume:
```
words.txt contains only lowercase characters and space ' ' characters.
Each word must consist of lowercase characters only.
Words are separated by one or more whitespace characters.
```
Note:
```
Don't worry about handling ties, it is guaranteed that each word's frequency count is unique.
Could you write it in one-line using Unix pipes?
```
Solution:
```
cat words.txt | tr -s ' ' '\n' | sort | uniq -c| sort -r | awk '{print $2, $1}'

```
```
Link: https://leetcode.com/problems/word-frequency/
```
