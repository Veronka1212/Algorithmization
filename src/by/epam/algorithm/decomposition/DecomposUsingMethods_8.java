package by.epam.algorithm.decomposition;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_8 {

    //Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5];
    // D[4] +D[5] +D[6].Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
    // расположенных элементов массива с номерами от k до m.

    public static void main(String[] args) {
        int[] array = {23, 5, 2, 67, 13, -2};
        System.out.println("Заданный массив: " + Arrays.toString(array));
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число k ");
        int k = getScan(scan, array.length);
        if (k <= 0 | k > 4) {
            System.out.println("Неверный ввод. Прочтите условия задачи.");
            System.exit(0);
        }
        System.out.print("Сумма трех последовательных элементов,начиная с " + k + "-го: "+summOfThree(array, k));
    }

    private static int getScan(Scanner scan, int l) {
        int k;
        while (true) {
            try {
                k = parseInt(scan.next());
                if (k >= 1 & k <= l - 2) {
                    return k;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели число, большее длинны массива, исправьтесь");
        }
    }

    public static int summOfThree(int[] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++)
            sum = sum + array[i];
        System.out.print(sum + "  ");
        return sum;
    }
}

