class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        ht = {} ## empty dictionary
        spot = 0
        
        while spot != len(arr):
            if 2* arr[spot] in ht or (arr[spot] % 2 == 0 and arr[spot]/2 in ht):
                return True
            else:
                ht[arr[spot]] = True 
                spot += 1
        return False
            
## Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/
        
        
