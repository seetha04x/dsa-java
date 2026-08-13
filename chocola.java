import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String[] args) {
        int n=4,m=6;

        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());

        int hp=1,vp=1;
        int h=0,v=0;
        int cost=0;;

        while(v<costVer.length && h<costHor.length){
            if(costVer[v]<=costHor[h]){
                hp++;
                cost+=(costHor[h]*vp);
                h++;
            }else{
                vp++;
                cost+=(costVer[v]*hp);
                v++;
            }
        }
         while(v<costVer.length){
            vp++;
            cost+=(costVer[v]*hp);
            v++;
         }
         while (h<costHor.length) {
            hp++;
            cost+=(costHor[h]*vp);
            h++;
         }
         System.out.println(cost);
    }
}
