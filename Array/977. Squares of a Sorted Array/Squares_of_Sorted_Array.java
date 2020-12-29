class Solution {
    public int[] sortedSquares(int[] nums) {
        // create the result array
        int N = nums.length;
        int[] result = new int[N];
        
        for(int i = 0; i < N; ++i){
            result[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(result);
        return result;
    }
}
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
