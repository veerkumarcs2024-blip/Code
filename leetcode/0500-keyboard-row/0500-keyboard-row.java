class Solution {
    public String[] findWords(String[] words) {
        String row0="qwertyuiop";
        String row1="asdfghjkl";
        String row2="zxcvbnm";
        List<String> ans=new ArrayList<>();
        for(String s: words){
            int[] temp=new int[3];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                char ch=Character.toLowerCase(c);
                if(row0.indexOf(ch)!=-1){
                    temp[0]=1;
                }else if(row1.indexOf(ch)!=-1){
                    temp[1]=1;
                }else{
                    temp[2]=1;
                }
            }
            if((temp[0]+temp[1]+temp[2])==1){
                ans.add(s);
            }

        }
        String result[]=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}