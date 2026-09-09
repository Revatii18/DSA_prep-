class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Phase 0a: check if first row originally has a zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Phase 0b: check if first column originally has a zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Phase 1: use first row/col as markers for the REST of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row i
                    matrix[0][j] = 0; // mark column j
                }
            }
        }

        // Phase 2: zero out cells based on markers (skip row 0 / col 0 for now)
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Phase 3: apply the saved first-row / first-col flags LAST
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }
        if (firstColHasZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}