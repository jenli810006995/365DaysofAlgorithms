You have some apples, where arr[i] is the weight of the i-th apple.  You also have a basket that can carry up to 5000 units of weight.

Return the maximum number of apples you can put in the basket.

Example 1:
```
Input: arr = [100,200,150,1000]
Output: 4
Explanation: All 4 apples can be carried by the basket since their sum of weights is 1450.
```
Example 2:
```
Input: arr = [900,950,800,1000,700,800]
Output: 5
Explanation: The sum of weights of the 6 apples exceeds 5000 so we choose any 5 of them.
``` 

Constraints:
```
1 <= arr.length <= 10^3
1 <= arr[i] <= 10^3
```

Solution(Python3):

1. Sorting
```
class Solution:
    def maxNumberOfApples(self, arr:List[int]) -> int:
        # sorting
        arr.sort() # start with the lighest one
        apples = units = 0
        
        for _, weight in enumerate(arr):
            units += weight
            if units > 5000:
                break
            apple += 1 # iterating
        return apples
        
TC: O(NlogN), becoz of sorting
SC: O(1), becoz we do not use additional data structure
```

2. min-heap: the first pop up from the heap would be the lighest one

Solution:
```
class Solution:
    def maxNumberOfApples(self, arr:List[int]) -> int:
        # build a heap only requires O(N)
        heapq.heapify(arr)
        apples = units = 0
        
        # note that arr[0] only represents the smallest element in the min-heap
        while arr and units + arr[0] <= 5000:
            units += heapq.heappop(arr)
            apples += 1
        return apples

TC: O(N + klogN)
SC: O(N)
```
Link: https://leetcode.com/problems/how-many-apples-can-you-put-into-the-basket/
