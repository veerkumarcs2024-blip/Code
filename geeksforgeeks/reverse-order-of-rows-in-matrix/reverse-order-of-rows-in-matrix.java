class Solution {
    void interchangeRows(int[][] mat) {
        // code here
        for(int col=0;col<mat[0].length;col++)
            {
                int i=0;
                int j=mat.length-1;
                while(i<j){
                    int temp=mat[i][col];
                    mat[i][col]=mat[j][col];
                    mat[j][col]=temp;
                    i++;
                    j--;
                }
            }
    }
}