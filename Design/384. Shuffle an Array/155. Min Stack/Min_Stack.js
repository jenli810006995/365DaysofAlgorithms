/**
 * initialize your data structure here.
 */
var MinStack = function() {
    this.stack = new Stack();
    this.minStack = new Stack();
};

/** 
 * @param {number} x
 * @return {void}
 */
MinStack.prototype.push = function(x) {
    this.stack.push(x);
    
    if (this.minStack.size === 0){
        this.minStack.push(x);
    } else if(x <= this.minStack.peek()){
        this.minStack.push(x);
    }
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    let removedElement = this.stack.pop(); // pop means remove element from the top
    if (removedElement == this.minStack.peek()){
        this.minStack.pop();
    }
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.stack.peek();
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.minStack.peek();
};

class Stack{
    constructor(){
        this.storage = {};
        this.size = 0;
    }
    
    push(val){ // push means add
        this.storage[this.size] = val;
        this.size ++;
    }
    
    pop(){
      let top = this.storage[this.size - 1];
      this.size --;
      delete this.storage[this.size];
      return top;
    }
    
    peek(){
      return this.storage[this.size - 1];
    }
    
    empty(){
      return this.size === 0;
    }
    
    getSize(){
      return this.size;
    }
}


/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
 
 // Link: https://leetcode.com/problems/min-stack/
