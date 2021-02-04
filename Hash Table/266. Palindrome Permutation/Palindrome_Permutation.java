// Use Hash Map
// TC: O(n)
// SC: O(1)

class Solution {
    public boolean canPermutePalindrome(String s) {
      HashMap <Character, Integer> map = new HashMap <> ();
      for (int i = 0; i < s.length(); i ++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1); // map.put() means to insert a new key into the hashmap
      }
      int count = 0;
      for (char key:map.keySet()){
        count += map.get(key) % 2; // %2 == 1 means it is palindrome
      }
      return count <= 1;
     }
  }

  // Link: https://leetcode.com/problems/palindrome-permutation/
