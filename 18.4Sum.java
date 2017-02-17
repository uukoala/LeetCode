public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for(int i = 0; i < nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length-2; j++){
                if(j>i+1 && nums[j]== nums[j-1]) continue;
                int k = j+1, l = nums.length -1, remain = target- nums[i] - nums[j];
                while(k<l){
                    if(nums[k] + nums[l] == remain){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(nums[k] + nums[l] > remain) l--;
                    else k++;
                }
            }
            
        }
        return res;
    }
}
