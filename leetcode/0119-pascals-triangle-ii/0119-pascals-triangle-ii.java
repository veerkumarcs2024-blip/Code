class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long el=1;
        ans.add(1);
        for(int col=1;col<=rowIndex;col++){
            el*=(rowIndex+1-col);
            el/=col;

            ans.add((int)el);
        }
        return ans;
    }
}