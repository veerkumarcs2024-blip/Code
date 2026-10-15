class Solution {
    public int nCr(int n, int r) {
        // code here
        if (r>n) {
            return 0;
        }
        if(n == r || r == 0)
        {
        return 1;
        }
        r=Math.min(r,n-r);
        long ans=1;
        for(int i=1;i<=r;i++){
            ans=ans*(n-i+1)/i;
        }
        return (int) ans;
    }
}