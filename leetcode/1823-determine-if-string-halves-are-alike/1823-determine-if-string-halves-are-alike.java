class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int vowelCount=0;
        for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
            if(isVowel(s.charAt(i+n/2))){
                vowelCount--;
            }
        }
        return vowelCount==0;
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}