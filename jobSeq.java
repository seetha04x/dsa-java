import java.util.*;

public class jobSeq {
    public static void main(String[] args) {
         int[][] jobs={{1,30},{1,10},{4,20},{1,40}};
         Arrays.sort(jobs, (a,b)->b[1]-a[1]);

         int time=0;
        int profit=0;
        ArrayList<Integer> ans= new ArrayList<>();

         for(int i=0;i<jobs.length;i++){
            if (jobs[i][0]>time){
                profit+=jobs[i][1];
                ans.add(jobs[i][1]);
                time++;
            }
         }
         System.out.println(profit);
         System.out.println(ans);
    }
}
