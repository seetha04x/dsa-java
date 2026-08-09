import java.util.LinkedList;
import java.util.Queue;

public class binaryq {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();

        q.add("1");

        int n=10;

        for(int i=0;i<n;i++){
            String num=q.remove();
            q.add(num+"0");
            q.add(num+"1");
            System.out.print(num+" ");
        }
    }
}
