class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        ## >> means shift over 
        
        result = 0
        xor = (x ^ y)
        
        while(xor > 0):
            result += (xor & 1)
            xor = xor >> 1
            
        return result
        
## Link: https://leetcode.com/problems/hamming-distance/
