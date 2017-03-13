public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        subSet(res, new LinkedList<Integer>(), nums, 0);
        return res;
    }

    private void subSet(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
        res.add(new LinkedList<Integer>(temp));
        for(int i = start; i<nums.length; i++){
            temp.add(nums[i]);
            subSet(res, temp, nums, i+1);
            temp.remove(temp.size() -1);
            while(i<nums.length-1 && nums[i] == nums[i+1]) i++;
        }
    }
}
