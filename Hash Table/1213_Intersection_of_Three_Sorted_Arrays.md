Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.

Example 1:
```
Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
Output: [1,5]
Explanation: Only 1 and 5 appeared in the three arrays.
```
Example 2:
```
Input: arr1 = [197,418,523,876,1356], arr2 = [501,880,1593,1710,1870], arr3 = [521,682,1337,1395,1764]
Output: []
``` 
Constraints:
```
1 <= arr1.length, arr2.length, arr3.length <= 1000
1 <= arr1[i], arr2[i], arr3[i] <= 2000
```

Solution:
```
# 1: Brute Force: Hash Map

class Solution:
    def arraysIntersection(self, arr1: List[int], arr2: List[int], arr3: List[int]) -> List[int]:
        ans = []
        # could create a dict or collections.Counter
        counter = collections.Counter(arr1 + arr2 + arr3) # concatenate them together
        
        for item in counter:
            if counter[item] == 3:
                ans.append(item)
        return ans
        
TC: O(n)
SC: O(n)

# 2: Three Pointers

class Solution:
    def arraysIntersection(self, arr1: List[int], arr2: List[int], arr3: List[int]) -> List[int]:
        ans = []
        
        # prepare three pointers to iterate through three arrays
        # p1, p2, and p3 point to the beginning of arr1, arr2, and arr3 accordingly
        
        p1 = p2 = p3 = 0
        
        while p1 < len(arr1) and p2 < len(arr2) and p3 < len(arr3):
            if arr1[p1] == arr2[p2] == arr3[p3]:
                ans.append(arr1[p1])
                p1 += 1
                p2 += 1
                p3 += 1
            else:
                if arr1[p1] < arr2[p2]:
                    p1 += 1
                elif arr2[p2] < arr3[p3]:
                    p2 += 1
                else:
                    p3 += 1
                    
       return ans
       
TC: O(n)
SC: O(1)
```
Link: https://leetcode.com/problems/intersection-of-three-sorted-arrays/
