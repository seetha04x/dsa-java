package Arrays;

public class productSelf {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=1;
        prefix[1]=nums[0];
        int suffix[]= new int[nums.length];
        suffix[nums.length-1]=1;
        suffix[nums.length-2]=nums[nums.length-1];
        
        for(int i=2;i<nums.length;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        for(int i=nums.length-3;i>=0;i--){
            suffix[i]=nums[i+1]*suffix[i+1];
        } 
        for(int i=0;i<nums.length;i++){
            prefix[i]=prefix[i]*suffix[i];
        }
        return prefix;
    }
    
}
