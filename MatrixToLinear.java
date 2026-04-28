import java.util.Scanner;

public class MatrixToLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: "); int rows = sc.nextInt();
        System.out.print("Enter columns: "); int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Value at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int linearIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[linearIndex++] = matrix[i][j];
            }
        }

        System.out.print("1D Array: ");
        for (int n : array) System.out.print(n + " ");
        sc.close();
    }
}