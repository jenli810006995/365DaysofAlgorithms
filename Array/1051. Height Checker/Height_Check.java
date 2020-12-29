class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null || heights.length <= 1) return 0;
        
        // make a copy and sort it
        int[] copy = heights.clone();
        Arrays.sort(copy);
        
        // compare the sorted copy with the original one
        int count = 0;
        for(int i = 0; i < heights.length; i ++){
            if(heights[i] != copy[i])
                count ++;
        }
        
        return count;

  }
};

// Link: https://leetcode.com/problems/height-checker/
