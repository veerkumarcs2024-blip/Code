class Solution {
    public int decimalEquivalent(String s, int b) {
        // code here
        int result = 0;
        int power=1;
        for(int i=s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            int digit;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }
            result += digit * power;
            power*=b;
        }
        return result;
    }
}