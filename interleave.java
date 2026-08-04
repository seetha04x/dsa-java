import java.util.LinkedList;
import java.util.Queue;


public class interleave {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        Queue<Integer> firstHalf=new LinkedList<>();
        int size=queue.size();

        for(int i=0;i<size/2;i++){
            firstHalf.add(queue.remove());
        }

        for(int i=0;i<size/2;i++){
            queue.add(firstHalf.remove());
            queue.add(queue.remove());
        }
        while(!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
