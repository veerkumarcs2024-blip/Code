class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int row = matrix.length;
        int col = matrix[0].length;

        int st_row = 0, st_col = 0;
        int end_row = row - 1, end_col = col - 1;

        while (st_row <= end_row && st_col <= end_col) {
            for (int i = st_col; i <= end_col; i++) {
                ans.add(matrix[st_row][i]);
            }
            st_row++;
            for (int i = st_row; i <= end_row; i++) {
                ans.add(matrix[i][end_col]);
            }
            end_col--;
            if (st_row <= end_row) {
                for (int i = end_col; i >= st_col; i--) {
                    ans.add(matrix[end_row][i]);
                }
                end_row--;
            }
            if (st_col <= end_col) {
                for (int i = end_row; i >= st_row; i--) {
                    ans.add(matrix[i][st_col]);
                }
                st_col++;
            }
        }

        return ans;
    }
}