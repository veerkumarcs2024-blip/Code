class Solution {
    public int binarySearch(int[] arr, int k) {
        // code here
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}