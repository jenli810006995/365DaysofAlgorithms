Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:
```
Input: s = "hello"
Output: "holle"
```
Example 2:
```
Input: s = "leetcode"
Output: "leotcede"
``` 
Constraints:
```
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
```
Solution(Python3):
```
class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = re.findall('(?i)[aeiou]', s)
        return re.sub('(?i)[aeiou]', lambda m: vowels.pop(), s)
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
Credit: https://leetcode.com/problems/reverse-vowels-of-a-string/discuss/81262/1-2-lines-PythonRuby
```
