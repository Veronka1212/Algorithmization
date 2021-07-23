package by.epam.algorithm.array;

import java.util.Scanner;

public class Matrix_6 {

    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    //1   1   1....1  1  1
    //0   1   1....1  1  0
    //0   0   1....1  0  0
    //..   .. ......  ....
    //0   0   1....1  0  0
    //0   1   1....1  1  0
    //1   1   1....1  1  1

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите чётное количество строк и столбцов n матрицы: ");
        int n = input.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= i & j <= n - i - 1) | (j <= i & j >= n - i - 1)) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}


