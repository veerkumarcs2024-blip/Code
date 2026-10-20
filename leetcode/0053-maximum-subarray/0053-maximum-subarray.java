class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum+= nums[i];
            if(nums[i]>current_sum){
                current_sum=nums[i];
            }
            if(current_sum>ans){
                ans=current_sum;
            }
        }
        return ans;
    }
}