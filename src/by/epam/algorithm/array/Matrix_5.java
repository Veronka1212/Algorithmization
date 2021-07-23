package by.epam.algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class Matrix_5 {

    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    //1   1   1....1  1
    //2   2   2....2  0
    //3   3   3....0  0
    //..   .. ......  0
    //n-1 n-1 0....0  0
    //n   0   0....0  0

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите чётное количество строк и столбцов n матрицы: ");
        int n = input.nextInt();
        int m = n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = i + 1;
            m = m - 1;
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if ((i + j) > n) matrix[i][j] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
