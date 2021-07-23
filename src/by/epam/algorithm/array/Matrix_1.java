package by.epam.algorithm.array;
import java.util.Random;
import java.util.Scanner;

public class Matrix_1 {

    //Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество строк матрицы: ");
        int n = input.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int m = input.nextInt();
        int array[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = random.nextInt(201) - 100;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        int j = 0;
        System.out.println("Искомые столбцы: ");
        for (int i = 0; i < m; i++) {
            if (((i % 2) == 0) & (array[0][j] > array[n - 1][j])) {
                for (int i2 = 0; i2 < n; i2++) {
                    System.out.println(" " + array[i2][j] + " ");
                }
                System.out.println();
            }
            j++;
        }
    }
}
