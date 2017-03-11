public class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length, i, j;
        if(m == 0 && n==0) return 0;
        for(i = 0; i<n; i++) grid[i][0] = (i==0?grid[i][0]:grid[i-1][0]+grid[i][0]);
        for(i = 0; i<m; i++) grid[0][i] = (i==0?grid[0][i]:grid[0][i-1]+grid[0][i]);
        if(n == 1) return grid[0][m-1];
        if(m == 1) return grid[n-1][0];
        for(i = 1; i<n; i++){
            for(j = 1; j<m; j++){
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1]) + grid[i] [j];
            }
        }
        return grid[n-1][m-1];
    }
}
