import java.util.Arrays;

public class job {
    int dead,profit;
    char id;
    job(char id, int dead, int profit){
        this.id=id;
        this.dead=dead;
        this.profit=profit;
    }
    public static void main(String[] args) {
        job job1 = new job('a', 4, 30);
        job job2 = new job('b', 3, 20);
        job job3 = new job('c', 1, 40);
        job job4 = new job('d', 4, 10);
    
        job jobs[]={job1,job2,job3,job4};

        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        //arr.sort(Comparator.comparingInt((Job j) -> j.profit).reversed());

        int max=0;
        for(job job :jobs){
            max=Math.max(max,job.dead);
        }

        char slots[]=new char[max+1];//1-indexing
        Arrays.fill(slots,'0');

        StringBuilder res=new StringBuilder();

        int profit=0;
        for(job job:jobs){
            for(int slot=job.dead;slot>0;slot--)
                if(slots[slot]=='0'){
                    slots[slot]=job.id;
                    profit+=job.profit;
                    res.append(job.id);
                    break;
                }
        }
        System.out.println(res);
        System.out.println(profit);
 
    }
}
