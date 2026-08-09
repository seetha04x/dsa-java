import java.util.*;

class pairs{
    int a,b;

    pairs(int a,int b){
        this.a=a;
        this.b=b;
    }
}

public class chainofpairs {
    public static void main(String[] args) {
        
    
    pairs chain[]={ new pairs(5,24),new pairs(39,60),new pairs(5,28),new pairs(27,40),new pairs(50,90)};

    Arrays.sort(chain, (x,y)->x.b-y.b);

    int lastUsed=0;
    int count=0;
    for(pairs ch : chain){
        if(ch.a >=lastUsed){
            lastUsed=ch.b;
            count++;
            System.out.print("("+ch.a+","+ch.b+") ");
        }
    }
    System.out.println();
    System.out.println(count);
}   
}