class Solution {
    public static int findSum(String s) {
        // code here
        int sum=0;
        int i=0;
        int n=s.length();
        while(i<n){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                int num=ch-'0';
                int j=i+1;
                while(j<n && s.charAt(j)>='0' && s.charAt(j)<='9'){
                    num=num*10+s.charAt(j)-'0';
                    j++;
                }
                i=j;
                sum+=num;
            }else{
                i++;
            }
        }
        return sum;
    }
}