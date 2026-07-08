package Arrays;

class Solution {
    public static boolean knight(int grid[][],int row,int col,int exp,int size){
        if(row<0||col<0||row>=size||col>=size||grid[row][col]!=exp) return false;
        if(exp==size*size-1) return true;
        boolean w1=knight(grid,row-2,col+1,exp+1,size);
        boolean w2=knight(grid,row-1,col+2,exp+1,size);
        boolean w3=knight(grid,row+1,col+2,exp+1,size);
        boolean w4=knight(grid,row+2,col+1,exp+1,size);
        boolean w5=knight(grid,row+2,col-1,exp+1,size);
        boolean w6=knight(grid,row+1,col-2,exp+1,size);
        boolean w7=knight(grid,row-1,col-2,exp+1,size);
        boolean w8=knight(grid,row-2,col-1,exp+1,size);

        return w1||w2||w3||w4||w5||w6||w7||w8;

    }

    public boolean checkValidGrid(int[][] grid) {
        int size=grid.length;
        return knight(grid,0,0,0,size);
    }
}