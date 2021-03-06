class Solution:
    def isValid(self, s : str) -> bool:
        stack = []
        paris = {'(':')', '{':'}', '[':']'}
        
        for char in s:
            if char in pairs:
                stack.append(pairs[char])
            else:
                if len(stack) == 0 or stack.pop() != char:
                    return False
       return len(stack) == 0
      
## Link: https://leetcode.com/problems/valid-parentheses/
