class WordDictionary:
    def __init__(self):
        """
        initialize your data structure here
        """
        self.trie = {}
        
    def addWord(self, word: str) -> None:
        node = self.trie
        
        for ch in word:
            if not ch in node:
                node[ch] = {}
            node = node[ch]
        node['$'] = True
        
    def search(self, word: str) -> bool:
        ## return if the word in the data structure. A word could contain a dot character to represent any letter
        
        def search_in_node(word, node) -> bool:
            for i, ch in enumerate(word):
                if not ch in node:
                    ## if the current character is a '.' then check all possible character at this level
                    if ch == '.':
                        for x in node:
                            if x != '$' and search_in_node(word[i + 1:], node[x]):
                                return True
                                
                   ## if no node leads to answer or current character == '.'
                    return False
                   
               # if the character is found, go down to the next level in trie
               
                else:
                    node = node[ch]
            return '$' in node
             
        return search_in_node(word, self.trie)

# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)
        
## Link: https://leetcode.com/problems/design-add-and-search-words-data-structure/
                
