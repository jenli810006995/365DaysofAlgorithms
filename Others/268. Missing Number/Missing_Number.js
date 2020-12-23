/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let sumNonMissing = nums.length;
    let actualSum = 0;
    
    for(let i = 0; i < nums.length; i ++){
        sumNonMissing += i;
        actualSum += nums[i];
    }
    
    return sumNonMissing - actualSum;
};

// Link: https://leetcode.com/problems/missing-number/
