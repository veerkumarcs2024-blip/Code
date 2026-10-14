class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        
        ArrayList<Integer> ans =new ArrayList<>();
        if(n==1){
            for(int j=0;j<m;j++){
                ans.add(mat[0][j]);
                
            }
            return ans;
        }
        
        for(int j=0;j<m;j++){
            ans.add(mat[0][j]);
        }
        if(n==1)
        return ans;
    
        for(int i=1;i<n;i++){
            ans.add(mat[i][m-1]);
        }
        
        if(m==1)
        return ans;
    
        for(int j=m-2;j>=0;j--){
            ans.add(mat[n-1][j]);
        }
        

        for(int i=n-2;i>=1;i--){
            ans.add(mat[i][0]);
        }
        
        return ans;
    }
}
