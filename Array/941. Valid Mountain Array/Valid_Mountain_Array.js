/**
 * @param {number[]} arr
 * @return {boolean}
 */
var validMountainArray = function(arr) {
    let N = arr.length;
    let i = 0;
    
    // edge case
    if(N === 0) return false;
    
    // walk up
    while(i + 1 < N && arr[i] < arr[i + 1]){
        i ++;
    }
    
    // check the peak cannot be the first nor the last
    if (i === 0 || i === N - 1) return false;
    
    // walk down
    while (i + 1 < N && arr[i] > arr[i + 1]){
        i ++;
    }

   return i === N - 1;

};

// Link: https://leetcode.com/problems/valid-mountain-array/
