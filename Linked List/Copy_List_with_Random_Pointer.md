## Iterative

```
class Solution(object):
    '''
    :type head: Node
    :rtype: Node
    '''
    def __init__(self):
        # create a dict to use old nodes as key and new nodes as values
        self.visited = {}
        
    def getClonedNode(self, node):
        # if node exists then
        if node:
        # check if it exists in the dict
            if node in self.visited:
                # return the new node reference from the dict
                return self.visited[node]
            else:
                # add the node to the dict
                self.visited[node] = Node(node.val, None, None)
                return self.visited[node]
            return None
            
    def copyRandomList(self, head):
        '''
        :type head: Node
        :rtype: Node
        '''
        if not head:
            return head
            
        old_node = head
        
        # create a new head node
        new_node = Node(old_node.val, None, None)
        self.visited[old_node] = new_node
        
        # iterate over all linked list until all nodes are cloned
        
        while old_node != None:
            # get the cloned of the node reference by next pointer and random pointer
            new_node.random = self.getClonedNode(old_node.random)
            new_node.next = self.getClonedNode(old_node.next)
            
        # Move on step ahead in the linked list
            old_node = old_node.next
            new_node = new_node.next
            
        return self_visited[head]
```

Link: https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1229/
