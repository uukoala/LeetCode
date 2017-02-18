public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int origin = x;
        long res = 0;
        while(x != 0){
            res = res*10 + x%10;
            x /= 10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE || res != origin){
            return false;
        }
        return true;
    }
}
