class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((mid-1<0 || nums[mid]>nums[mid-1])&&(mid+1>=nums.length || nums[mid]>nums[mid+1])){
                return mid;
            }else if(mid-1>=0 && nums[mid-1]>nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}