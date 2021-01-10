var reverseList = function(head) {
    let prevNode = null;
    
    while(head != null){
        let nextNode = head.next;
        head.next = prevNode;
        prevNode = head;
        head = nextNode;
    }
    
    return prevNode;

}

// Link: https://leetcode.com/problems/reverse-linked-list/
