class Solution:
    def reverseBits(self, n: int) -> int:
        reverse = bin(n)[::-1][:-2]
        reverse += '0'*(32 - len(reverse))
        return int(reverse, 2)
        
## Link: https://leetcode.com/problems/reverse-bits/
        
        
