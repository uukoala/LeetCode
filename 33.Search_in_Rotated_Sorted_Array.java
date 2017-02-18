public class Solution {
    public int search(int[] nums, int target) {
        int begin = 0, end = nums.length-1;
        while(begin<end){
            int mid = (begin + end)/2;
            if(nums[mid] > nums[end]) begin = mid+1;
            else end = mid;
        }
        
        int head = begin;
        begin = 0; 
        end = nums.length-1;
        while(begin<=end){
            int mid = (begin + end)/2;
            int realmid = (head + mid)%nums.length; 
            if(nums[realmid] == target) return realmid;
            else if(nums[realmid] > target) end = mid-1;
            else begin = mid+1;
        }
        return -1;
    }
}
