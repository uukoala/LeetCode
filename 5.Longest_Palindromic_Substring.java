public class Solution {
    private int begin = 0, max = 0;

    public String longestPalindrome(String s) {
        for (int i = 0; i<s.length(); i++){
            longestPalindrome(s, i, i);
            longestPalindrome(s, i, i+1);
        }
        return s.substring(begin, begin + max);
    }
    private void longestPalindrome(String s, int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if(k - j - 1>max){
            begin = j+1;
            max = k-j-1;
        }
    }
}
