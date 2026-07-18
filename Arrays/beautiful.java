class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        while(arr.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            //odd no
            for(int i :arr){
                if(2*i-1<=n) temp.add(2*i-1);
            }
            //even no
            for(int i :arr){
                if(2*i<=n) temp.add(2*i);
            }
            arr=temp;
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++) res[i]=arr.get(i);
        return res;
    }
}