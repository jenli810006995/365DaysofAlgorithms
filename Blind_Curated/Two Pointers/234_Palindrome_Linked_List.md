Given the head of a singly linked list, return true if it is a palindrome.

Constraints:
```
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
``` 
Follow up: Could you do it in O(n) time and O(1) space?

Solution(Python3):
```
class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        # Phase 1: reverse the first half while finding the middle
        # Phase 2: compare the reversed first half with the second half
        
        rev = None # initialize the reversed
        slow = fast = head
        while fast and fast.next: # while fast and fast.next exist
            fast = fast.next.next # pointer
            rev, rev.next, slow = slow, rev, slow.next # reverse the first half, while finding the middle
        if fast:
            slow = slow.next
        while rev and rev.val == slow.val:
            slow = slow.next
            rev = rev.next
        return not rev
        
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/palindrome-linked-list/
```
