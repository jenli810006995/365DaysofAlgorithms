Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null.

Solution(Python3):
```
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        if headA == None and headB == None:
            return None
        elif headA != None and headB == None:
            return None
        elif headA == None and headB != None:
            return None
        else:
            len_a = 0
            len_b = 0
            
            current = headA
            while current != None:
                current = current.next
                len_a += 1
                
            current = headB
            while current != None:
                current = current.next
                len_b += 1
                
            diff = 0
            current = None
            if len_a > len_b:
                diff = len_a - len_b
                currentA = headA
                currentB = headB
            else:
                diff = len_b - len_a
                currentA = headB
                currentB = headA
            
            count = 0
            while count < diff:
                currentA = currentA.next
                count += 1
                
            while currentA != None and currentB != None:
                if currentA == currentB:
                    return currentA
                else:
                    currentA = currentA.next
                    currentB = currentB.next
```
Link: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
