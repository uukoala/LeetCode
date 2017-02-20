public class Solution {
    public int climbStairs(int n) {
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int preOneStep = 2, preTwoStep = 1, cur =0;
        
        for(int i = 3; i <=n; i++){
            cur = preOneStep + preTwoStep;
            preTwoStep = preOneStep;
            preOneStep = cur;
        }
        return cur;
    }
}
