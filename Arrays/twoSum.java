package Arrays;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
  
    public int[] twoSum(int[] nums, int target) {
        int diff;
        Map<Integer,Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            diff=target-nums[i];
            if(seen.containsKey(diff)) return new int[]{seen.get(diff),i} ;
            seen.put(nums[i],i);
        }
        return new int[]{};
    }
}
    

