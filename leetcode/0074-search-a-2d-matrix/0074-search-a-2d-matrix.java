class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=(m*n)-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int midValue=matrix[mid/n][mid%n];
            if(midValue==target){
                return true;
            }else if(midValue>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}