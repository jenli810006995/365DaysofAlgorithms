Design a data structure that accepts a stream of integers and checks if it has a pair of integers that sum up to a particular value.

Implement the TwoSum class:

TwoSum() Initializes the TwoSum object, with an empty array initially.
void add(int number) Adds number to the data structure.
boolean find(int value) Returns true if there exists any pair of numbers whose sum is equal to value, otherwise, it returns false.
 
Example 1:
```
Input
["TwoSum", "add", "add", "add", "find", "find"]
[[], [1], [3], [5], [4], [7]]
Output
[null, null, null, null, true, false]

Explanation
TwoSum twoSum = new TwoSum();
twoSum.add(1);   // [] --> [1]
twoSum.add(3);   // [1] --> [1,3]
twoSum.add(5);   // [1,3] --> [1,3,5]
twoSum.find(4);  // 1 + 3 = 4, return true
twoSum.find(7);  // No two integers sum up to 7, return false
``` 
Constraints:
```
-105 <= number <= 105
-231 <= value <= 231 - 1
At most 5 * 104 calls will be made to add and find.
```
Solution(Python3):
```
# Sorted List

class TwoSum:
    def __init__(self):
        self.nums = []
        self.is_sorted = False
        
    def add(self, nums: int) -> None:
        self.nums.append(number)
        self.is_sorted = False
        
    def find(self, value: int) -> bool:
        """
        find if there exists any pair of numbers which sum is equal to the value
        """
        if not self.is_sorted:
            self.nums.sort()
            self.is_sorted = True
            
        low, high = 0, len(self.nums) - 1
        while low < high:
            currSum = self.nums[low] + self.nums[high]
            if currSum < value:
                low += 1
            elif currSum > value:
                high -= 1
            else:
                return True
        return False
       
# TC: O(NlongN)
# SC: O(N)

```
Link: https://leetcode.com/problems/two-sum-iii-data-structure-design/
