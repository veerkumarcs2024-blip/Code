class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
            List<Character>[] buckets = new List[s.length() + 1];
            for(char key : count.keySet()){
                int freq = count.get(key);
                if (buckets[freq] == null){
                    buckets[freq]=new ArrayList<>();
                }
                buckets[freq].add(key);
            }
            StringBuilder sb = new StringBuilder();
            for(int i=buckets.length-1;i>0;i--){
                if(buckets[i] != null){
                    for(char ch : buckets[i]){
                        for(int j=0;j<i;j++){
                            sb.append(ch);
                        }
                    }
                }
            }
            return sb.toString();
    }
}