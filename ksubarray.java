import java.util.*;

public class ksubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=4;

        int sum=0,max=0;//sum= Largest Maximum that can be obtained, max= minimum Maximum
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }

        int left=max,right=sum;
        int ans=sum;

        while(left<=right){
            int mid=(left+right)/2;

            int count=1, currSum=0;

            for(int num:arr){ //each subarray has sum < than that max sum
                if(currSum+num >mid){
                    count++;
                    currSum=num;
                }else{
                    currSum+=num;
                }
            }
            if(count<= k){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(ans);
    }
}
