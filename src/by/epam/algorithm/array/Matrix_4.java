package by.epam.algorithm.array;

import java.util.Scanner;

public class Matrix_4 {

    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    //1   2    3.......n
    //n  n-1   n-2.....1
    //1   2    3.......n
    //n  n-1   n-2.....1
    //..  ..    .......n
    //n  n-1   n-2.....1

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите чётное количество строк и столбцов n матрицы: ");
        int n = input.nextInt();
        int m = n + 1;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) matrix[i][j] = j + 1;
            } else {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = m - 1;
                    m = m - 1;
                }
            }
            m = n + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
