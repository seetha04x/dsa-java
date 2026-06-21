package Arrays;
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

    // using prefix array
    
    //  public static void maxSubArray(int arr[],int n){
    //     int i,j,sum=0;
    //     int large=Integer.MIN_VALUE;
    //     int prefix[]=new int[n];
    //     prefix[0]=arr[0];
    //     for(i=1;i<n;i++){
    //         prefix[i]=prefix[i-1]+arr[i];
    //     }
    //     for(i=0;i<n;i++){
    //         for(j=i;j<n;j++){
    //             if(i==0) sum=prefix[j];
    //             else sum=prefix[j]-prefix[i-1];
    //             if (sum>large){
    //                 large=sum;
    //             }
    //         }
    //     }
    //     System.out.println("Max sum = "+large);
    // }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=maxSubArray(num);
        System.out.println("Maximum Subarray sum= "+sum);
    }
}
