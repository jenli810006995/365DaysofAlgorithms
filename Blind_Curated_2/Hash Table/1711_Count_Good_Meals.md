A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.

You can pick any two different foods to make a good meal.

Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.

Note that items with different indices are considered different even if they have the same deliciousness value.

Constraints:
```
1 <= deliciousness.length <= 105
0 <= deliciousness[i] <= 220
```

Solution:
```
class Solution:
    def countPairs(self, deliciousness: List[int]) -> int:
        ans = 0
        freq = defaultdict(int)
        for x in deliciousness:
            for k in range(22):
                ans += freq[2**k - x]
            freq[x] += 1
        return ans % 1_000_000_007

#TC: O(n)
#SC: O(n)
```
```
Link: https://leetcode.com/problems/count-good-meals/
```
