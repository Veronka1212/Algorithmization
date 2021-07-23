package by.epam.algorithm.array;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Matrix_7 {

    //Сформировать квадратную матрицу порядка N по правилу A(I,J)=sin((I^2-J^2)/N)

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = getScan(scan);
        double[][] array = new double[N][N];
        for (int k = 0; k < N; k++) {
            for (int l = 0; l < N; l++) {
                array[k][l] = calculation(k, l, N);
                System.out.print(array[k][l] + " ");
            }
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

    public static double calculation(int i, int j, int N) {
        double a = Math.sin((i * i - j * j) / N);
        return a;
    }
}
