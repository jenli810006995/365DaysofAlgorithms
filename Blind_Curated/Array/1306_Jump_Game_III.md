Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach to any index with value 0.

Notice that you can not jump outside of the array at any time.

Constraints:
```
1 <= arr.length <= 5 * 104
0 <= arr[i] < arr.length
0 <= start < arr.length
```
Solution(Python3):
BFS:
```
class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        n = len(arr)
        q = [start] # a list
        
        while q:
            node = q.pop(0)
            # check if reach 0
            if arr[node] == 0:
                return True
            if arr[node] < 0:
                continue
                
            # check available next steps
            for i in [node + arr[node], node - arr[node]]:
                if 0 <= i < n:
                    q.append(i)
                    
            # mark as visited by making it negative
            arr[node] = -arr[node]
            
        return False

# TC: O(n)
# SC: O(n)
```

Solution(Python3):
DFS
```
class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        if 0 <= start < len(arr) and arr[start] >= 0:
            if arr[start] == 0:
                return True
            # mark visited as negative
            arr[start] = -arr[start]
            
            return self.canReach(arr + srr[start]) or self.canReach(arr - srr[start]) 
            
        return False

# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/jump-game-iii/
```
