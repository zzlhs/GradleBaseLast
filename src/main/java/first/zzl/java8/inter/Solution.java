package first.zzl.java8.inter;
/**
 *  回型矩阵的写法老牛逼了
 *    
 *    
 *     
 * 
 *
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = solution.getMatrix(6, 15);
        solution.print(matrix);
    }

    private void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.print('\n');
        }
    }

    private int[][] getMatrix(int m, int n) {
        if (m <= 0 || n <= 0) {
            return null;
        }
        int[][] matrix = new int[m][n];
        int i = 0, j = 0;
        Direction direction = Direction.RIGHT;
        int counter = 1;
        while (!outOfBounder(i, j, m, n) && matrix[i][j] == 0) {
            matrix[i][j] = counter++;
            int nexti = i + direction.vertical;
            int nextj = j + direction.horizontal;
            if (outOfBounder(nexti, nextj, m, n) || matrix[nexti][nextj] > 0) {
                direction = direction.change();
            }
            i = i + direction.vertical;
            j = j + direction.horizontal;
        }
        return matrix;
    }

    private boolean outOfBounder(int i, int j, int m, int n) {
        return i >= m || j >= n || i < 0 || j < 0;
    }

}

enum Direction {
    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    int horizontal;
    int vertical;

    Direction(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public Direction change() {
        switch (this) {
            case RIGHT:
                return DOWN;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case UP:
                return RIGHT;
        }
        return null;
    }
}
