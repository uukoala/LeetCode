public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer> res = new LinkedList<>();

        Arrays.sort(nums);
        getSubset(res, new LinkedList<>(), nums, 0);
        return res;
    }
    
    private void getSubset(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
        res.add(new LinkedList<>(temp));
        for(int i = start; i<nums.length; i++){
            temp.add(nums[i]);
            getSubset(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }    
}
