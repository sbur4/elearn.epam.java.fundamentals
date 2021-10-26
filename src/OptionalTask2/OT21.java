package OptionalTask2;

import java.util.Random;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 * <p>
 * Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 */

public class OT21 {
    private static int rows = 5;
    private static int cols = 5;
    private static int[][] matrix = new int[rows][cols];
    private static int from = 3;
    private static int to = 50;

    public static void main(String[] args) {
        System.out.println("Before sort: ");
        createMatrix();
//        System.out.println(Arrays.deepToString(matrix));
        System.out.println();
        System.out.println("After sort: ");
//        System.out.println(Arrays.deepToString(sortMatrix(matrix, k)));
        sortMatrix(matrix);
        displaySortMatrix(matrix);
    }

    private static int[][] createMatrix() {
        Random random = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = random.ints(from, to + 1).findFirst().getAsInt();
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    private static int[][] sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length - j - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int t = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = t;
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] displaySortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        return matrix;
    }
}
