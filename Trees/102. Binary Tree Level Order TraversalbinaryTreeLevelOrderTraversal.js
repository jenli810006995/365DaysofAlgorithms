var levelOrder = function(root) {
  // create an empty array for result
  let result = [];
  
  if (root === null) return result;
  
  // create an empty array for queue
  let queue = [];
  queue.push(root);
  
  while (queue.length > 0){
    let row = [];
    let rowSize = queue.length;
    
    while (rowSize > 0){
      let currentNode = queue.shift();
      if (currentNode.left !== null){
        queue.push(currentNode.left);
        }
      if (currentNode.right !== null){
        queue.push(currentNode.right);
      }
      row.push(currentNode.val);
      rowSize --;
    }
    result.push(row);
  }
  return result;
  };
  
  
