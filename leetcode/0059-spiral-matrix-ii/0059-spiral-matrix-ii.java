class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int top = 0, bottom = n-1;
        int left = 0, right = n-1;

        int val = 1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                result[top][j]=val++;
            }top++;
            for(int i=top;i<=bottom;i++){
                result[i][right]=val++;
            }right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    result[bottom][j]=val++;
                }bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result[i][left]=val++;
                }left++;
            }
        }return result; 
    }
}