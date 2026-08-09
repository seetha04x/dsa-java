import java.util.*;

class minabsdiff {
    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,5,6};

        // int a[]={1,2,3};
        // int b[]={2,3,1};
        
        //to find minimum differnece the nos shold be nearer, so big num comapred with big, smal with small

        Arrays.sort(a);
        Arrays.sort(b);

        int diff=0;

        for(int i=a.length-1;i>=0;i--){
            diff+=Math.abs(a[i]-b[i]);
        }
        System.out.println(diff);
    }
    
}