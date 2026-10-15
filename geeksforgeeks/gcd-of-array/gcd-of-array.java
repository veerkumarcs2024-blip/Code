class Solution {
    public int gcd(int n, int arr[]) {
        int gcd = arr[0];
        for (int i = 1; i<arr.length; i++) {
            gcd = gcd(gcd, arr[i]);
        }
        return gcd;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}