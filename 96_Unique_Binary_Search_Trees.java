public class Solution {
    public int numTrees(int n) {
        int [] res = new in[n+1];
        res[0] = res[1] = 1;
        for(int i = 2; i < n+1; i++){
            for(int j = 1; j < i+1; j++){
                res[i] += res[j-1] * res[i-j];
            }
        }
        return res[n];
    }
}
