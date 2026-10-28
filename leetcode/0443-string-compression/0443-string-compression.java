class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int index=0;
        int i=0;
        while(i<n){
            char ch=chars[i];
            int count=1;
            int j=i+1;
            while(j<n && chars[j]==ch){
                count++;
                j++;
            }
            chars[index]=ch;
            index++;
            if(count>1){
                String st=""+count;
                for(int k=0;k<st.length();k++){
                    chars[index]=st.charAt(k);
                    index++;
                }
            }
            i=j;
        }
        return index;
    }
}