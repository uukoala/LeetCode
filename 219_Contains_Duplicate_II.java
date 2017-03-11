public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            if(res.containsKey(nums[i]) && (i - res.get(nums[i]) <= k)) return true;
            res.put(nums[i], i);
        }
        return false;
    }
}
