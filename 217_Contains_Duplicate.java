//Time complexity O(NlogN); 
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }
}


//Time complexity O(N);
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<Integer>();
        for(int num: nums){
            if(res.contains(num)) return true;
            res.add(num);
        }
        return false;
    }
}

