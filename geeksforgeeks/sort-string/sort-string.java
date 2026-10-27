class Solution {
    public String sortString(String s) {
        // code here
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}