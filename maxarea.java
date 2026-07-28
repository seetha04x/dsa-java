
import java.util.Stack;

public class maxarea {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        Stack<Integer> stack =new Stack<>();
        Stack<Integer> stackR =new Stack<>();

        int n=arr.length;    
        int area=0;
        int left[]=new int[n];
        int right[]=new int[n];

        //next smaller left
        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty() &&arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) left[i]=-1;
            else left[i]=stack.peek();

            stack.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(left[i]+" ");
        }
        System.out.println();

        //next smaller right
        for(int i=n-1;i>=0;i--){
            while(!stackR.isEmpty() && arr[stackR.peek()]>arr[i]){
                stackR.pop();
            }
            if(stackR.isEmpty()) right[i]=n;
            else right[i]=stackR.peek();

            stackR.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(right[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            System.out.println("For "+arr[i]+" width="+width+" area="+arr[i]*width);
            area=Math.max(area,arr[i]*width);
        }
        System.err.println("Area= "+area);
    }
}
