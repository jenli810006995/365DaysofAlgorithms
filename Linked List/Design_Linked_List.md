Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:
```
MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, 
the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. 
If index equals the length of the linked list, the node will be appended to the end of the linked list. 
If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
```

Solution(Python3):
```
class Node(object):
    def __init__(self, val):
        self.val = val
        self.next = None
        self.prev = None
class MyLinkedList(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.dummy_head = Node(0)
        self.dummy_tail = Node(0)
        self.dummy_tail.prev = self.dummy_head
        self.dummy_head.next = self.dummy_tail
        self.size = 0
        
    def get(self, index: int) -> int:
        """
        Get the value of the index-th node in the linked list. If the index is invalid, return -1.
        """
        if index < 0 or index >= self.size:
            return -1
        curr_node = self.dummy_head.next
        for _ in range(index):
            curr_node = curr_node.next
        return curr_node.val
        
    def addAtHead(self, val: int) -> None:
        """
        Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
        """
        node = Node(val)
        node.next = self.dummy_head.next
        node.prev = self.dummy_head
        self.dummy_head.prev.next = node
        self.dummy_head.next = node
        self.size += 1
        
    def addAtTail(self, val: int) -> None:
        """
        Append a node of value val to the last element of the linked list.
        """
        node = Node(val)
        node.prev = self.dummy_tail.prev
        node.next = self.dummy_tail
        self.dummy_tail.prev.next = node
        self.dummy_tail.prev = node
        self.size += 1
        
    def addAtIndex(self, index: int, val: int) -> None:
        """
        Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
        """
        if index < 0 or index > self.size:
            return
        if index == 0:
            self.addAtHead(val)
        elif index == self.size:
            self.addAtTail(val)
        else:
            curr_node = self.dummy_head.next
            for _ in range(index - 1):
                curr_node = curr_node.next
            node = Node(val)
            node.next = curr_node.next
            node.prev = curr_node
            curr_node.next.prev = node
            curr_node.next = node
            self.size += 1
    def deleteAtIndex(self, index: int) -> None:
        """
        Delete the index-th node in the linked list, if the index is valid.
        """
        if index < 0 or index >= self.size:
            return
        curr_node = self.dummy_head
        for _ in range(index):
            curr_node = curr_node.next
        curr_node.next.next.prev = curr_node
        curr_node.next = curr_node.next.next
        
        self.size -= 1
           
```
Link: https://leetcode.com/explore/learn/card/linked-list/210/doubly-linked-list/1294/
