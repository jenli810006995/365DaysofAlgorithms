Given an array, rotate the array to the right by k steps, where k is non-negative.

Constraints:
```
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 ```
Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?

Solution(JS):
```
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
 
 var rotate = function(nums, k){
     k = k % nums.length
     
     reverse(nums, 0, nums.length - 1);
     reverse(nums, 0, k - 1);
     reverse(nums, k, nums.length - 1);
 };
 
 var reverse = function(nums, start, end){
     while (start < end){
         let temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start ++;
         end --;
     }
 };

```
Link: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
