class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int row_0=0,col_0=0;
        int n=mat.length;
        int m=mat[0].length;    
        for(int i=0;i<m;i++){
            if(mat[0][i]==1){
                row_0=1;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(mat[i][0]==1){
                col_0=1;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==1){
                    mat[i][0]=1;
                    mat[0][j]=1;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][0]==1 || mat[0][j]==1)
                mat[i][j]=1;
            }
        }
        if(row_0==1){
            for(int i=0;i<m;i++){
                mat[0][i]=1;
            }
        }
        if(col_0==1){
            for(int i=0;i<n;i++){
                mat[i][0]=1;
            }
        }
    }
}