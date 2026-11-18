class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int h=0;
        for(int num : nums){
            l=Math.max(l, num);
            h+=num;
        }
        while(l<h){
            int mid=l+(h-l)/2;
            if(canSplit(nums,k,mid)){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    private boolean canSplit(int [] nums, int k, int maxA){
        int s=1;
        int c=0;
        for(int num : nums){
            if(c+num<=maxA){
                c+=num;
            }else{
                s++;
                c=num;
                if(s>k){
                return false;
                }
            }
        }
        return true;
    }
}