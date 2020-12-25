class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        N = len(arr)
        i = 0
        
        ## first check edge cases, which means that the peak cannot be the first and the last element
        if N == 0:
            return False

            
        ## walk up
        while i + 1 < N and arr[i] < arr[i + 1]:
            i += 1
            
        ## check if the peak is the first or the last            
        if i == 0 or i == N - 1:
            return False
            
        ## walk down
        while i + 1 < N and arr[i] > arr[i + 1]:
            i += 1
            
        return i == N - 1
        
