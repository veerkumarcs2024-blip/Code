class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> result=new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(left==right){
                result.add(arr[left]);
                break;
            }
            result.add(arr[right]);
            result.add(arr[left]);
            right--;
            left++;
        }
        return result;
    }
}
