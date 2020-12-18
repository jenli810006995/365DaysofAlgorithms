var isValidBST = function(root) {

// create a helpfer function to validate if it is valid BST

function helper(node, min, max){
  if (! node) return true;
  if (min !== null && node.val < min || max!== null && node.val > max) return false;
  
  let left = helper(node.left, min, node.val);
  let right = helper(node.right, node.val, max);
  
  return left && right;
}

return helper(root, -Infinity, Infinity)
};

// Link: https://leetcode.com/problems/validate-binary-search-tree/ 
