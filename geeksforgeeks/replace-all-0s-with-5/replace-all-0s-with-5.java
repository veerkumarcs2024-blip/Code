class Solution {
    public int convertFive(int n) {
        // code here
        int final_re = 0;
        int fr = 0;
        if(n==0){
            return 5;
        }
        while(n>0){
            int last_digit = n%10;
            if(last_digit==0){
                last_digit = 5;
            }
            final_re = final_re*10+last_digit;
            n=n/10;
        }
        while(final_re>0){
            int ld=final_re%10;
            fr = fr*10+ld;
            final_re=final_re/10;
        }
        return fr;
    }
}