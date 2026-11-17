class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int left=binearySearch(nums,target,true);
        int right=binearySearch(nums,target,false);
        ans[0]=left;
        ans[1]=right;
        return ans;
        
    }
    int binearySearch(int[] nums, int target, boolean flag){
        int l=0;
        int r=nums.length-1;
        int pos=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                pos=mid;
                if(flag==true){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return pos;
    }
}