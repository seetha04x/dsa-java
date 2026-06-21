package Arrays;

public class twoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target) return new int[]{left+1,right+1};
            else if (numbers[left]+numbers[right]<target) left++;
            else right--;
        }
        return new int[]{};

    //     for(int i=0;i<numbers.length;i++){
    //         int left=i+1;
    //         int right=numbers.length-1;
    //         int key=target-numbers[i];
    //         while(left<=right){
    //             int mid=(left+right)/2;
    //             if(numbers[mid]==key) return new int[]{i+1,mid+1};
    //             else if(numbers[mid]>key) right=mid-1;
    //             else left=mid+1;
    //     }
    //    }
    //    return new int[]{};
    }
    
}
