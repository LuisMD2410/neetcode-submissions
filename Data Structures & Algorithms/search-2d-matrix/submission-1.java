class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int r = matrix[i].length - 1;
            while (l <= r) {
                int midIndex = (l + r) / 2;
                int midNum = matrix[i][midIndex];
                if (midNum > target) {
                    r = --midIndex;
                } else if (midNum < target) {
                    l = ++midIndex;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
