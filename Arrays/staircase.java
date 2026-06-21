package Arrays;
public class staircase {
    public static void stairCaseSearch(int arr[][],int n, int target){
        int row=n-1, col=0;

        while (row>=0 && col<=n-1){
            if(target>arr[row][col]){
                col++;
            }
            else if(target<arr[row][col]){
                row--;
            }else{
                System.out.println("Found at ("+row+","+col+")");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50},
        };
        stairCaseSearch(arr,4,37);
    }
}
