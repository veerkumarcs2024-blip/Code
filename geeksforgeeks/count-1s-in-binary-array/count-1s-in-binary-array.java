class Solution {
    public int countOnes(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}