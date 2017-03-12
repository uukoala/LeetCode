public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0) return 0;
        if(m == 1 || n == 1) return 1;
        int[] res = new int[n];
        Arrays.fill(res,1);
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                res[j] += res[j-1];
            }
        }
        return res[n-1];
    }
}
