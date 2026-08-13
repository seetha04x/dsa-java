import java.util.*;

public class indiancoins {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,200,500};

        int price=490;
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;

        int i=coins.length-1;
        while(i>=0){
            if(coins[i]<=price) {
                price-=coins[i];
                count++;
                ans.add(coins[i]);
            }else i--;
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
