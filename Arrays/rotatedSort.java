public class rotatedSort {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            if(nums[left]<=nums[mid]){//search in left sorted
                    if(target>=nums[left] && target<nums[mid]){
                        right=mid-1;
                    }else left=mid+1;
            }else if(nums[mid]<=nums[right]){
                if(target<=nums[right] && target>nums[mid]){
                    left=mid+1;
                }else right=mid-1;
            }
        }
        return -1;
    } 
    
    public static int rotatedSort(int arr[], int target,int left,int right){
        if(left>right) return -1;

        int mid=(left+right)/2;

        if(arr[mid]==target) return mid;

        if(arr[mid]<=arr[right]){
            if(target<=arr[right] && target>arr[mid]){
                return rotatedSort(arr, target, mid+1, right);
            }else {return rotatedSort(arr, target, left, mid-1);
            }
        }
        else {
            if(target<arr[mid] && target>=arr[left]){
                return rotatedSort(arr, target, left, mid-1);
            }else {return rotatedSort(arr, target, mid+1, right);
            }
        } 
    }  
}
