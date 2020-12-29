class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Use two pointers
        int cn1 = 0;
        int cn2 = 0;
        int maxCount = 0;
        
        for(int num:nums){
            if(num == 1){
                ++cn2;
            }else{
                cn1 = cn2 + 1;
                cn2 = 0;
            }
            maxCount = Math.max(cn1+cn2, maxCount);
        }    
        return maxCount;
    }
}

// Link: https://leetcode.com/problems/max-consecutive-ones-ii/
