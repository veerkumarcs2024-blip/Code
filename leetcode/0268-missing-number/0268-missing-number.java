class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=nums[i];
        }
        int ans=sum-arr_sum;
        return ans;
    }
}