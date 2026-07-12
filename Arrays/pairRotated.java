

public class pairRotated {
    public static int[] rotated(int arr[],int target){
        int i;
        for(i=0;i<arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int left=i+1;
        int right=i;

        while(left!=right){
            int sum=arr[left]+arr[right];

            if(sum>target) right=(arr.length+right-1)%arr.length;
            else if(sum<target) left=(left+1)%arr.length;
            else return new int[]{left,right};
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int arr[]={11,15,6,8,9};
        int target=14;
        int idx[]=rotated(arr,target);
        for(int i=0;i<idx.length;i++){
            System.out.print(idx[i]+" ");
        }
    }
}
