/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node); // add node to the queue
        // create a map to see if the elements in the queue has been visited -> in the map
        Map<Node, Node> map = new HashMap<Node, Node>();
        map.put(node, new Node(node.val));
        while(! queue.isEmpty()){
            Node current = queue.poll();
            for(Node neighbor: current.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    
    }
}

// The poll() method of Queue Interface returns and removes the element at the front the container. 
// It deletes the element in the container. The method does not throws an exception when the Queue is empty, it returns null instead.

// Link: https://leetcode.com/problems/clone-graph/
