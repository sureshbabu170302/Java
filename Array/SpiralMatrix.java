public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = generateSpiralMatrix(3, 3);
        printMatrix(matrix);
    }

    public static int[][] generateSpiralMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int value = 1;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse Right
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = value++;
            }
            topRow++;

            // Traverse Down
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = value++;
            }
            rightCol--;

            // Traverse Left
            for (int i = rightCol; i >= leftCol; i--) {
                matrix[bottomRow][i] = value++;
            }
            bottomRow--;

            // Traverse Up
            for (int i = bottomRow; i >= topRow; i--) {
                matrix[i][leftCol] = value++;
            }
            leftCol++;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
