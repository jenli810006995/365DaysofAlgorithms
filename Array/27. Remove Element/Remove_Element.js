/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let pointer1 = 0;
    
    for(let pointer2 = 0; pointer2 < nums.length; pointer2 ++){
        if(nums[pointer2] != val){
            nums[pointer1] = nums[pointer2];
            pointer1 ++;
        }
    }
    
    return pointer1;
};

// Link: https://leetcode.com/problems/remove-element/
