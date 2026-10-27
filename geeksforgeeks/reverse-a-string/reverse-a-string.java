class Solution {
    public static String reverseString(String s) {
        // code here
        // StringBuilder sb=new StringBuilder(s);
        // sb.reverse();
        // return sb.toString();
        // char[] arr = s.tocharArray();
        // int i=0;
        // int j=arr.length-1;
        // while(i<j){
        //     char temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
        // return new String(arr);
        return new StringBuilder(s).reverse().toString();
    }
}