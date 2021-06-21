Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Constraints:
```
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
```
Solution(Python3):
```
class Solution:
    # @param {string} digits
    # @return {string[]}
    
    def letterCombinations(self, digits):
        mapping = {'2':'abc', '3':'def', '4':'ghi', '5':jkl,
                   '6':'mno', '7':'pqrs', '8':'tuv', '9':'wxyz'}
                   
        if len(digits) == 0:
            return []
            
        if len(digits) == 1:
            return list(mapping[digits[0]])
            
        prev = self.letterCombinations(digits[:-1])
        additional = mapping[digits[-1]]
        return [s + c for s in prev for c in additional]
        
# TC: O(4^N*N), where N is the length of digits. NOte 4 here refers to the maximun length in the hashmap, e.g. 7 and 9
# SC: O(N), where N is the length of digits

```
```
Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
```
