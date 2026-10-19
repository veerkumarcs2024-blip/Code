class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] zigzag = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            zigzag[i] = new StringBuilder();
        }
        int currentRow = 0;
        int direction = 1;
        for (char c : s.toCharArray()) {
            zigzag[currentRow].append(c);

            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(zigzag[i]);
        }

        return result.toString();
    }
}