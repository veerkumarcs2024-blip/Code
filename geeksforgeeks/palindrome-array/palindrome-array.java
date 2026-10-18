class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int start=0, end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
