class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> seen= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] arr = new List[nums.length + 1];
        for(int key: seen.keySet()){
            int count=seen.get(key);
            if(arr[count]==null){
                arr[count]=new ArrayList<>();
            }
            arr[count].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=arr.length-1;i>=0 && res.size()<k;i--){
           if (arr[i]!=null) res.addAll(arr[i]);
        }
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=res.get(i);
        }
        return result;
    }
}