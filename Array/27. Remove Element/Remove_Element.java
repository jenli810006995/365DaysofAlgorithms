// Use two pointers, if nums[j] != val, move nums[j] to the front of the array

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int j = 0; j < nums.length; j ++){
            if(nums[j] != val){
                nums[index] = nums[j];
                index ++;
            }
        }
        
        return index;
    }
}

// Link: https://leetcode.com/problems/remove-element/

