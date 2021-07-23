package by.epam.algorithm.array;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Matrix_14 {

    //Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
    // причем в каждом столбце число единиц равно номеру столбца

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Введите m ");
            int m = getScan(scan);
            System.out.print("Введите n (равное или меньшее, чем m) ");
            int n = getScan(scan);
            if (n > m) {
                System.out.println("N<M и программа будет работать некорректно, запустите программу заново и введите корректные данные");
                System.exit(0);
            }

        Integer[][] array = new Integer[m][n];

        System.out.println("Матрица после сортировки заполнения 0 и 1 ");
        zeroOne(array, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
    }

    private static int getScan(Scanner scan) {
        int n;
        while (true) {
            try {
                n = parseInt(scan.next());
                if (n > 0 & n % 1 == 0) {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели неверное число, введите натуральное");
        }
    }

    public static Integer[][] zeroOne(Integer[][] array, int k, int m) {
        int flag = 0;
        int zero = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < k; i++) {
                array[i][j] = (int) (Math.random() * 2);
                if (array[i][j].equals(1)) {
                    flag++;
                } else {
                    zero++;
                }
                if (array[i][j].equals(1) & flag > j + 1) {
                    array[i][j] = 0;
                } else if (array[i][j].equals(0) & zero > k - j - 1) {
                    array[i][j] = 1;
                }
            }
            flag = 0;
            zero = 0;
        }
        return array;
    }
}


