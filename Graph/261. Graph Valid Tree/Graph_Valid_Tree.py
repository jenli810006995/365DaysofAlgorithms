# Graph Theory + Iterative DFS
# TC: O(N + E), N: # of nodes; E: # of edges
# SC: O(N + E)

class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
    
        if len(edges) != n - 1:
            return False
            
        adj_list = [[] for _ in range(n)]
        for A, B in edges:
            adj_list[A].append(B)
            adj_list[B].append(A)
            
        parent = {0: -1}
        stack = [0]
        
        while stack:
            node = stack.pop()
            for neighbor in adj_list[node]:
                if neighbor == parent[node]:
                    continue
                if neighbor in parent:
                    return False
                    
                parent[neighbor] = node
                stack.append(neighbor)
                
        return len(parent) == n
        
# Link: https://leetcode.com/problems/graph-valid-tree/
