class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        // Arrays.sort(arr);/
        for(int i=0;i<arr.length;i++){
            int el=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>el){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=el;
        }
    }
}