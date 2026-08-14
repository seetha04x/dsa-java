import java.util.*;
public class lexicograph {
    public static void main(String[] args) {
        int n=5,k=42;

        char[] ans=new char[n];
        
        Arrays.fill(ans,'a');

        int need=k-n;//already n 'a's (a=1) filled so bakki kandupidikanam 

        for(int i=ans.length-1;i>=0;i--){
            if(need>0){
                if(need>25){
                    ans[i]=(char)('a'+25);
                    need-=25;}
                else{
                    ans[i]=(char)('a'+need);
                    need=0;
                }
            }else break;
        }
        System.out.println(ans);
    }
}
