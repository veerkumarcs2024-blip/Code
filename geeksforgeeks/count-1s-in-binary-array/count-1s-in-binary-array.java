class Solution {
    public int countOnes(int[] arr) {
        // code here
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==1){
        //         count++;
        //     }else{
        //         break;
        //     }
        // }
        // return count;
        int l=0;
        int r=arr.length-1;
        int ans=arr.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==1){
                l=mid+1;
            }else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
}