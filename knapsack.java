import java.util.*;
//did it with shradha

class Item{
        int index;
        double ratio;//value/weight
        Item(int index,double ratio){
            this.index=index;
            this.ratio=ratio;
        }
    }
public class knapsack {
    public static void main(String[] args) {
        int weight[]={30,20,10};
        int value[]={120,100,60};
        int knap=50;

        int total=0;
        int profit=0;
        Item items[]=new Item[value.length];

        for(int i=0;i<value.length;i++){
            items[i]=new Item(i,(double)value[i]/weight[i]);
        }
        // Arrays.sort(items,(a,b)-> b.ratio-a.ratio);
        Arrays.sort(items,(a,b)-> Double.compare(b.ratio,a.ratio));

        for(int i=0;i<items.length;i++){
            // if(knap>=weight[items[i].index]){
            //knap-weight
            
            if(total<knap && weight[items[i].index]<knap-total){
                total+=weight[items[i].index];
                profit+=value[items[i].index];
            }else{
                int extra=knap-total;
                total=knap;
                profit+=extra*items[i].ratio;
                break;
            }
        }
        System.out.println("Profit="+profit);
    }
}
