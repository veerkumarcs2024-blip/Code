class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        if(arr==null || arr.length<2){
            return false;
        }
        Set<Integer> seen=new HashSet<>();
        for(int num : arr){
            if(seen.contains(num-x)||seen.contains(num+x)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
