class Solution {
    public String convertToCamelCase(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                capitalizeNext=true;
            }else{
                if(capitalizeNext){
                    result.append(Character.toUpperCase(ch));
                    capitalizeNext=false;
                }else{
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}