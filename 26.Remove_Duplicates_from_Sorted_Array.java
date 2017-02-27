public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, len=1;
        if(n == 0) return 0;
        if(n == 1) return 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]) nums[len++] = nums[i];
        }    
        return len;
    }
}
