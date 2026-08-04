import java.util.*;

public class rope {
    public static void main(String[] args) {
        int arr[]={4,2,3,6};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int sum=0;

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int left=pq.remove();
            int right=pq.remove();
            sum+= left+right;
            pq.add(left+right);
        }
    System.out.println(sum);    

    }
}
