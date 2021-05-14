We can represent a sentence as an array of words, for example, the sentence "I am happy with leetcode" can be represented as arr = ["I","am",happy","with","leetcode"].

Given two sentences sentence1 and sentence2 each represented as a string array and given an array of string pairs similarPairs where similarPairs[i] = [xi, yi] indicates that the two words xi and yi are similar.

Return true if sentence1 and sentence2 are similar, or false if they are not similar.

Two sentences are similar if:

They have the same length (i.e. the same number of words)
sentence1[i] and sentence2[i] are similar.
Notice that a word is always similar to itself, also notice that the similarity relation is not transitive. For example, if the words a and b are similar and the words b and c are similar, a and c are not necessarily similar.

Solution(Python3):
```
class Solution:
  def areSentencesSimilar(self, sentence1: List[str], sentence2: List[str], similarPairs: List[List[str]]) -> bool:
      l1 = len(sentence1)
      l2 = len(sentence2)
      
      if l1 != l2:
          return False # the first criteria
          
      from collections import defaultdict
      dic = collections.defaultdict(set) # create a set into default.factory
      
      for p in similarPairs:
          dic[p[0]].add(p[1]) # creating the key-value paris in the dictionary
          dic[p[1]].add(p[0])
          
      for i in range(l1):
          w1, w2 = sentence1[i], sentence2[i]
          
          if w1 != w2 and w2 not in dic[w1]:
              return False
      return True

# TC: O(n)
# SC: O(n) # dictionary uses associative data structure which cost O(n) space complexity
```
Link: https://leetcode.com/problems/sentence-similarity/
