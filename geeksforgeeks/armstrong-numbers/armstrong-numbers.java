class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original=n;
        int sum=0;
        while(n>0){
            int last_digit=n%10;
            sum+=last_digit*last_digit*last_digit;
            n/=10;
        }
        return (sum==original);
    }
}