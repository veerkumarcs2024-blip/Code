class Solution {
    void makeZeros(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[][] temp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j] = mat[i][j];
            }
        }
        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(temp[i][j]==0){
                    int sum=0;
                    for(int k=0;k<4;k++){
                        int ni=i+rowDir[k];
                        int nj=j+colDir[k];
                        if(ni>=0 && ni<n&& nj>=0 && nj<m){
                            sum+=temp[ni][nj];
                            mat[ni][nj]=0;
                        }
                    }
                    mat[i][j]=sum;
                }
            }
        }
    }
}