package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums){
    Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    } 
    // HashSet<Integer> seen=new HashSet<>();
    // for(int i=0;i<nums.length;i++){
    //     if (seen.contains(nums[i])) return true;
    //         seen.add(nums[i]);
    //     }
    //     return false;   
}
