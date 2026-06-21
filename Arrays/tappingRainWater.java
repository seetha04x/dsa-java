package Arrays;
public class tappingRainWater {
    public int trap(int[] height) {
        int sum=0;
        int prefix[]=new int[height.length];
        int suffix[]=new int[height.length];
        prefix[0]=height[0];
        suffix[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
            suffix[height.length-i-1]=Math.max(suffix[height.length-i],height[height.length-i-1]);
        }
        //for (int i = n-2; i >= 0; i--) {
        //  suffix[i] = Math.max(suffix[i+1], height[i]);
        //}
        for(int i=0;i<height.length;i++){
            sum+=Math.min(suffix[i],prefix[i])-height[i];
        }
        
        return sum;
    }
} 
