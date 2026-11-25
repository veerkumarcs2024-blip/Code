class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        if(arr==null || arr.length<3){
            return -1;
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            if(arr[i-2]+ arr[i-1]> arr[i]){
                return arr[i-2]+arr[i-1]+arr[i];
            }
        }
        return -1;
    }
}