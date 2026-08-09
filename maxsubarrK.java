import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class maxsubarrK {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5,2,3,6};
        int n=9,k=3;

        List<Integer> list=new ArrayList<>();
        

        int i=0;
        while(i<=n-k){
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<3;j++){
                pq.add(arr[i+j]);
            }
            list.add(pq.remove());
            i=i+1;
        }
        System.out.println(list);
    }
}
//deque approach


public class MaxSubarrayDeque {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int n = arr.length, k = 3;

        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();

            // remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) dq.pollLast();

            dq.addLast(i);

            // record max once window is ready
            if (i >= k - 1) result.add(arr[dq.peekFirst()]);
        }

        System.out.println("Deque approach: " + result);
    }
}


