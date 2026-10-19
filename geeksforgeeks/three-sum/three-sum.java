class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i] == arr[i - 1]){
                continue;
            }
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    result.add(new ArrayList<>(Arrays.asList(
                        arr[i],
                        arr[left],
                        arr[right]
                        )));
                        while(left<right && arr[left]==arr[left + 1]){
                            left++;
                        }
                        while(left<right && arr[right]==arr[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return result;
    }
}
