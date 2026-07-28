import java.util.*;

public class stockspan {
    public static void main(String[] args) {
        int arr[]= {100, 80, 60, 70, 60, 75, 85};
        Stack<Integer> stack=new Stack<>();
        int span[]=new int[7];
        stack.push(0);
   
            span[0]=1;
        
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i] ){
                stack.pop();
            }
            span[i]=(stack.empty())?i+1:i-stack.peek();
            stack.push(i);
        }
        for(int i=0;i<7;i++){
            System.out.print(span[i]+" ");
        }

    }
    
}