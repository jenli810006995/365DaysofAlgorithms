class Solution {
    public int findMin(int[] nums) {
    // if the nums has only one element, return that element
    if (nums.length == 1) return nums[0];
    
    // init the left and the right pointers
    int left = 0, right = nums.length - 1;
    
    // if the last element is gt the first element, there is no rotation and the first element is the smallest
    if(nums[right] > nums[0]) return nums[0];
    
    // Binrary Search
    while(right >= left){
      // Find the mid point
      int mid = left + (right - left)/2;
      
      // if mid is gt than its next point, mid + 1 is the smallest value, and mid + 1 is the inflection point
      if(nums[mid] > nums[mid + 1]) return nums[mid + 1];
      
      // if mid is lt its previous value, then mid is the smallest value, and mid is the inflection point
      if(nums[mid - 1] > nums[mid]) return nums[mid];
      
      // if mid is gt the 0th element, this means the smallest is somewhere to the right
      // if 0th element is gt then mid, this means the smallest is somewhere to the left
      if(nums[mid] > nums[0]){
          left = mid + 1;
      }else{
          right = mid - 1;
      } 
    }
    return -1; 
    
    }
}

// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
