class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int pile:piles){
            r=Math.max(r,pile);
        }
        int ans=r;
        while(l<=r){
            int k=l+(r-l)/2;
            long th=0;
            for(int i=0;i<piles.length;i++){
                th+=piles[i]/k;
                if(piles[i]%k!=0){
                    th++;
                }
            }
            if(th<=h){
                ans=k;
                r=k-1;
            }else{
                l=k+1;
            }
        }
        return ans;
    }
}