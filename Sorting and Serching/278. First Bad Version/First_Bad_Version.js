/**
 * Definition for isBadVersion()
 * 
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
      // Binary Search, if the mid is not the bad version, the bad version should be to the right of the mid point
      let left = 1;
      let right = n;
      
      while (left < right){
      // create a mid point
      let mid = left + Math.floor((right - left)/2);
      if (!isBadVersion(mid)) {
          left = mid + 1; // mid is not the bad version, move to the right of mid
      } else{
          right = mid;
      }
    }
   return left;
};
};

// Link: https://leetcode.com/problems/first-bad-version/
