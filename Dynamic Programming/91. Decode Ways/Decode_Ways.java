class Solution {
    public int numDecodings(String s) {
        int a = 1, pre = 1, curr = 0;
        
        for(int i = 0; i < s.length(); i ++){
            curr = pre;
            if(s.charAt(i) == '0'){
              curr = 0;
              if(i - 1 >= 0){
                if(s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6'))
                    curr += a;
              }
            }
            else if(i - 1 >= 0){
              if(s.charAt(i - 1) == '1'|| (s.charAt(i - 1) == '2' && s.charAt(i) <= '6'))
                  curr += a;
            }
            a = pre;
            pre = curr;
        }
    return pre;
    }
}

// Link: https://leetcode.com/problems/decode-ways/
