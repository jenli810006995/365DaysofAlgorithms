class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        out = list(filter(lambda x: len(str(x))%2 == 0, nums))
        return len(out)
        
 ## Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
