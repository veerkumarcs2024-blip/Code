class Solution {
    public void solve (int i, int j,String s, HashSet <String> hs){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                hs.add(s.substring(i,j+1));
            }else{
                break;
            }
            i--;
            j++;
        }
    }
    public ArrayList<String> palindromicSubstr(String s) {
        // code here
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            solve(i,i+1,s,hs);
            solve(i,i,s,hs);
        }
        return new ArrayList<>(hs);
    }
}