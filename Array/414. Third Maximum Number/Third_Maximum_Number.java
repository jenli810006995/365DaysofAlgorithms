class Solution {
    public int thirdMax(int[] nums) {
    
    // create a HashSet to have distinct elements
    
    Set<Integer> setNums = new HashSet<>();
    
    for(int num : nums){
        setNums.add(num);
    }
    
    // check if the legnth < 3 then return maximum
    
    int maximum = Collections.max(setNums);
    
    if(setNums.size() < 3) return maximum;
    
    setNums.remove(maximum);
    int secondMaximum = Collections.max(setNums);
    setNums.remove(secondMaximum);
    return Collections.max(setNums);
    
    }
    
}

// Link: https://leetcode.com/problems/third-maximum-number/
