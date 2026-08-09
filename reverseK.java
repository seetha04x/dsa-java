
import java.util.*;
public class reverseK {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        int k=4;

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    
    
}
