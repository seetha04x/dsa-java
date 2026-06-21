public class maxSubArray {
    public static int maxSubArray(int nums[]){
        //using kadane algorithm
        int sum=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);// to start with the nums[i] is the calculated sum is less, so the sum can start from the greater nums[i]
            max=Math.max(max,sum);
        } 
        return max;
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=maxSubArray(num);
        System.out.println("Maximum Subarray sum= "+sum);
    }
}
