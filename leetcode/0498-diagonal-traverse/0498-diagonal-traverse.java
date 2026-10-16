class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row * col];
        int level = 1;
        int index = 0;
        for (int c = 0; c < col; c++) {
            int i = 0;
            int j = c;
            ArrayList<Integer> arr = new ArrayList<>();

            while (i < row && j >= 0) {
                arr.add(mat[i][j]);
                i++;
                j--;
            }
            if (level % 2 == 1) {
                Collections.reverse(arr);
            }

            for (int num : arr) {
                result[index++] = num;
            }
            level++;
        }
        for (int r = 1; r < row; r++) {
            int i = r;
            int j = col - 1;
            ArrayList<Integer> arr = new ArrayList<>();

            while (i < row && j >= 0) {
                arr.add(mat[i][j]);
                i++;
                j--;
            }

            if (level % 2 == 1) {
                Collections.reverse(arr);
            }

            for (int num : arr) {
                result[index++] = num;
            }
            level++;
        }
        return result;
    }
}