class Trie {
    class Node{
        boolean isLeaf;
        Node[] children = new Node[26];
        public Node(){}
    }
    
    private Node root = new Node();
    
    public Trie(){}
    
    public void insert(String word){
        Node end = insert(root, word, 0);
        end.isLeaf = true;
    }
    
    public boolean search(String word){
        Node end = search(root, word, 0);
        return end != null && end.isLeaf;
    }
    
    public boolean startsWith(String prefix){
        return search(root, prefix, 0) != null;
    }
    
    private Node insert(Node node, String word, int i){ // return end node
        if (i == word.length()) return node;
        int idx = word.charAt(i) - 'a';
        if(node.children[idx] == null) node.children[idx] = new Node();
        return insert(node.children[idx], word, i + 1);
    }
    
    private Node search(Node node, String str, int i){ // return end node, return null if not match
        if (i == str.length()) return node;
        int idx = str.charAt(i) - 'a';
        if(node.children[idx] == null) return null;
        return search(node.children[idx], str, i + 1);
        
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
 
 // Link: https://leetcode.com/problems/implement-trie-prefix-tree/
