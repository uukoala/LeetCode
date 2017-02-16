public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
	Map<Character, Integer> map = new HashMap<Character, Integer>();
        int begin =0, max_len = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                begin = Math.max(begin, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max_len = Math.max(max_len, i - begin + 1);
       
	}
        return max_len;
    }
}
