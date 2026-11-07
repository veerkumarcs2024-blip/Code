class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        int[] count=new int[total+1];
        int a=-1;
        int b=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                count[grid[i][j]]++;
            }
        }
        for(int num=1;num<=total;num++){
            if(count[num]==2){
                a=num;
            }else if(count[num]==0){
                b=num;
            }
        }
        return new int[]{a,b};
    }
}