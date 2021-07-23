package by.epam.algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class Matrix_2 {

    //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество строк и столбцов квадратной матрицы: ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                array[i][j] = random.nextInt(201) - 100;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Диагональ: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i][i]);
            for (int j = 0; j < i + 1; j++)
                System.out.print("   ");
        }
    }
}