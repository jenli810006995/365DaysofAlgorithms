Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Solution(Python3):
```
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        """
        :type head: ListNode
        :type val:int
        :rtype: ListNode 
        """
        if head == None:
            return head
        elif head != None and head.next == None:
            if head.val == val:
                return None
            else:
                return head
        else:
            dummy = ListNode(0)
            dummy.next = head
            prev = dummy
            
            while head != None:
                if head.val == val:
                    prev.next = head.next # remove head
                    head = prev
                prev = head
                head = head.next
                
            return dummy.next
```
Link: https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
