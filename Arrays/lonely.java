package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map <Integer,Integer> seen=new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int left=nums[i]-1,right=nums[i]+1;
            if(!(seen.containsKey(left)) && !(seen.containsKey(right))){
                if( seen.get(nums[i])==1){
                    arr.add(nums[i]);
                }   
            }
        }
        return arr;
    }
} 
