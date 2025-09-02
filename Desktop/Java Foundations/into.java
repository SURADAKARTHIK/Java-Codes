import java.util.Scanner;

public class into {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows in Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns in Matrix A / rows in Matrix B: ");
        int c1 = sc.nextInt();
        System.out.print("Enter number of columns in Matrix B: ");
        int c2 = sc.nextInt();

        // Matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[c1][c2];
        int[][] C = new int[r1][c2]; // Result matrix

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                 A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output Result
        System.out.println("Resultant Matrix C:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
