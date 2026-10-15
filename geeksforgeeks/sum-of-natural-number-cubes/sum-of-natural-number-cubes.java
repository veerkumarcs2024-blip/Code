class Solution {
    int sumOfSeries(int n) {
        int sum = 0;
        
        for(int i = 1; i <=n; i++ ){
            sum += i * i * i;
        }
        return sum;
    }
}