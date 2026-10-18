class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int second_largest = -1;
        for(int num:arr){
            if(num>largest){
                second_largest = largest;
                largest=num;
            }else if(num>second_largest && num<largest) {
                second_largest=num;
            }
        }
        return second_largest;
    }
}