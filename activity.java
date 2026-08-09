import java.util.*;
//did it
public class activity {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        // int start[]={0,8,5,5,3,1};
        // int end[]={6,9,7,9,4,2};
        int activities[][]= new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));//comapring 2d array where compared based on 2nd col-end col
        ArrayList<Integer> res=new ArrayList<>();
        int lastUsed=0;
        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastUsed){
                lastUsed=activities[i][2];
                res.add(activities[i][0]);
            }
        }
        for(int i:res){
            System.out.print("Activity: "+i+" ");
        }
    }

    //other version for comparison like job
    class Activity {
    int id, start, end;
    Activity(int id, int start, int end) {
        this.id = id; this.start = start; this.end = end;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {0,8,5,5,3,1};
        int end[]   = {6,9,7,9,4,2};

        Activity[] activities = new Activity[start.length];
        for (int i=0; i<start.length; i++) {
            activities[i] = new Activity(i, start[i], end[i]);
        }

        Arrays.sort(activities, (a, b) -> a.end - b.end);}
}
