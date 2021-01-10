// with Stack
// TC: O(N)
// SC: O(N)

class Solution {
    public void reorderList(ListNode head) {
    if(head == null || head.next == null)
        return;
        
    ListNode slow = head, fast = slow.next;
    while(fast != null && fast.next != null){
        slow = slow.next; // slow move in 1 step
        fast = fast.next.next; // fast move in 2 steps
    }
    
    // create a stack
    Stack<ListNode> stack = new Stack();
    ListNode current = slow.next;
    slow.next = null;
    while(current != null){
        stack.push(current);
        current = current.next;
    }
    
    current = head;
    while(stack.size() > 0){
        stack.peek().next = current.next;
        current.next = stack.pop();
        current = current.next.next;
    }
  }
}


// Without Stack
// TC:O(N)
// SC: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
            
        // 1. Reach to the middle of the list
        
        ListNode slow = head, fast = slow.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // 2. Reverse the secondhalf
        ListNode preMiddle = slow;
        ListNode preCurrent = slow.next;
        while(preCurrent.next != null){
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }
        
        // 3. Merge
        
        slow = head;
        ListNode secondHalf = preMiddle.next;
        while(slow != preMiddle){
            preMiddle.next = secondHalf.next;
            secondHalf.next = slow.next;
            slow.next = secondHalf;
            slow = secondHalf.next;
            secondHalf = preMiddle.next;   
        }
    }
}

// Link: https://leetcode.com/problems/reorder-list/
