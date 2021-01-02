class Solution {
    public String minWindow(String s, String t) {
        // if s and t has 0 length, return ""
        if(s.length() == 0 || t.length() == 0) return "";
        
        Map<Character, Integer> dictT = new HashMap<Character, Integer>();
        
        // t is our target, put the elements in t to dictT
        for(int i = 0; i < t.length(); i ++){
            int count = dictT.getOrDefault(t.charAt(i), 0);
            dictT.put(t.charAt(i), count + 1);
        }
        
        // the size of the sliding window
        int required = dictT.size();
        
        // Filter all the character from s into a new list
        List<Pair<Integer, Character>> filterS = new ArrayList<Pair<Integer, Character>>();
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(dictT.containsKey(c)){
                filterS.add(new Pair<Integer, Character>(i, c));
            }
        }
        
        int l = 0, r = 0, formed  = 0;
        
        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();
        int[] ans = {-1, 0, 0};
        
        // Look for char only in filterS
        
        while(r < filterS.size()){
            char c = filterS.get(r).getValue();
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);
            
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()){
                formed ++;
            }
            
            // Try and contract the window till the point it ceases to "desirable"
            while(l <= r && formed == required){
                c = filterS.get(l).getValue();
                // save the smallest window till now
                int end = filterS.get(r).getKey();
                int start = filterS.get(l).getKey();
                if(ans[0] == -1 || end - start + 1 < ans[0]){
                    ans[0] = end - start + 1;
                    ans[1] = start;
                    ans[2] = end;
                }
                
                windowCounts.put(c, windowCounts.get(c) - 1);
                if(dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()){
                    formed --;
                }
                l ++;
            }
            r ++;
        }
        return ans[0] == -1 ? "": s.substring(ans[1], ans[2] + 1);
    
   }
}

// Link: https://leetcode.com/problems/minimum-window-substring/
