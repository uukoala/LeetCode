public class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, len = 0;
        for(int element: nums){
            if(element != val) nums[len++] = element;
        }
        return len;
    }
}
