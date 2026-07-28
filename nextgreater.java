import java.util.Stack;
//did it
public class nextgreater {
    public static void main(String[] args) {
        int arr[]={8,8,0,1,3,9};
        Stack<Integer> stack=new Stack<>();

        int res[]=new int[6];
        int n=6;
        res[n-1]=-1;
        stack.push(arr[n-1]);

        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty()&& arr[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.err.print(res[i]+" ");
        }
    }
}
