package by.epam.algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class Matrix_3 {

    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество строк матрицы: ");
        int n = input.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int m = input.nextInt();
        int array[][] = new int[n][m];
        System.out.print("Введите k: ");
        int k = input.nextInt();
        System.out.println("Введите p: ");
        int p = input.nextInt();
        if ((k > n) | (p > m)) {
            System.out.print("Введены некорректные данные! k или p превышают значения размеров матрицы!");
            System.exit(0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = random.nextInt(201) - 100;
        }
        System.out.println("k-я строка:");
        for (int j = 0; j < m; j++)
            System.out.print(array[k - 1][j] + " ");
        System.out.println();
        System.out.println("p-й столбец:");
        for (int i = 0; i < n; i++)
            System.out.println(array[i][p - 1] + " ");

    }
}