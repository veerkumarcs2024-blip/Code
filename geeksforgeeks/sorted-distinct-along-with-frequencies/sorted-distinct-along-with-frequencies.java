class Solution {
    public ArrayList<ArrayList<Integer>> freqSorted(int[] arr) {
        // code here
        TreeMap<Integer, Integer> freqMap=new TreeMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            ArrayList<Integer> pair=new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;
    }
}