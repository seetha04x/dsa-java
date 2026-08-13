import java.util.*;

public class balancedstring {
    public static void main(String[] args) {
        String s="lrrrrllrllrl";

        int lcount=0,rcount=0;
        int count=0;

        for(char ch: s.toCharArray()){
            if(ch=='l') lcount++;
            else rcount++;

            if(lcount==rcount){
                count++;
                lcount=0;
                rcount=0;
            }
        }
        System.out.println(count);
    }
}
