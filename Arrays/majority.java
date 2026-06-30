public class majority {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // Map<Integer,Integer> seen=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        //     if(seen.get(nums[i])>nums.length/2) return nums[i];
        // }
        // return -1;

        int candidate=0,count=0;
        for(int i=0;i<nums.length;i++){
            if (count==0) candidate= nums[i];
            count+=(nums[i]==candidate)? 1:-1;
        }
        return candidate;
    }
    
}
