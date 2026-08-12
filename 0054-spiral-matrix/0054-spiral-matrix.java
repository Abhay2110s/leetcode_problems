class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        List<Integer> lst = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Left -> Right
            for (int i = left; i <= right; i++) {
                lst.add(matrix[top][i]);
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                lst.add(matrix[i][right]);
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    lst.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    lst.add(matrix[i][left]);
                }
                left++;
            }
        }

        return lst;
    }
}










// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         int x = 0;
//         int y = 0;
//         int dx = 1;
//         int dy = 0;
//         List<Integer> res = new ArrayList<>();

//         for (int i = 0; i < rows * cols; i++) {
//             res.add(matrix[y][x]);
//             matrix[y][x] = -101; // the range of numbers in matrix is from -100 to 100

//             if (!(0 <= x + dx && x + dx < cols && 0 <= y + dy && y + dy < rows) || matrix[y+dy][x+dx] == -101) {
//                 int temp = dx;
//                 dx = -dy;
//                 dy = temp;
//             }

//             x += dx;
//             y += dy;
//         }

//         return res;        
//     }
// }