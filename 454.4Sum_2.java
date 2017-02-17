public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int m = A.length, res = 0;
        if(m == 0) return 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       
	for(int i = 0; i<m; i++){
            for(int j = 0; j<m; j++){
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<m; j++){
                int sum = -1 * (C[i] + D[j]);
                res += map.getOrDefault(sum, 0);
            }
        }
        return res;
    }
}
