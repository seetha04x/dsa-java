import java.util.ArrayList;

public class kthlargest {
    public static void main(String[] args) {
        int l=-3;
        int r=3;
        int k=2;

        if(l==r){
            System.out.println(0);
            return;
        }
        int oddR=(r%2==0 ? r-1:r);

        int count=1;
        int oddL=oddR;

        while(oddL>=l){
            oddL-=2;
            count++;
        }

        // int oddR = (r % 2 == 0) ? r - 1 : r;
        // int oddL = (l % 2 == 0) ? l + 1 : l;
        // int count = ((oddR - oddL) / 2) + 1;

        if(k>count){
            System.out.println(0);
        }else{
            System.out.println(oddR-2*(k-1));
        }

    }
}
