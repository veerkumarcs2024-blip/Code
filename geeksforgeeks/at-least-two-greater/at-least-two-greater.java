class Solution {
    public ArrayList<Integer> findElements(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            result.add(arr[i]);
        }
        return result;
    }
};