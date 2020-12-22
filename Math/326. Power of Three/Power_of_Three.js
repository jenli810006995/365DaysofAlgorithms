/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
    let result = 1;
    
    while (result < n){
      result *= 3;
    }
    
    return result === n;
};

// Link: https://leetcode.com/problems/power-of-three/
