package Arrays;

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while (left<right){
            int min=Math.min(height[left],height[right]);
            int width=right-left;
            max=Math.max(max,min*width);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}
