public class Solution {
    public int maxArea(int[] height) {
        int begin = 0, end = height.length-1;
        int max = 0;
        while(begin != end){
            max = Math.max(max, Math.min(height[begin], height[end]) * (end - begin));
            if(height[begin] >= height[end]) end--;
            else begin++;
        }
        return max;
    }
}
