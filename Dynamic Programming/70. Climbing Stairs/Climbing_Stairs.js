// memoization is a method to create a map and store seen results to it to avoid calculating the same results again

/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
// first, create a counting function, we have two options, n - 1 stairs at a time, and n - 2 stairs at a time
// second, create a map to store visited calculation

  var countingFunc = function(stairsRemaining, savedResults){
      if (stairsRemaining < 0) return 0;
      
      if (stairsRemaining === 0) return 1;
      
      if (savedResults[stairsRemaining]) return savedResults[stairsRemaining];
      
      savedResults[stairsRemaining] = countingFunc(stairsRemaining - 1, savedResults) + countingFunc(stairsRemaining - 2, savedResults);
      
      return savedResults[stairsRemaining]; 
  }

return countingFunc(n, {});
};

// Link: https://leetcode.com/problems/climbing-stairs/
