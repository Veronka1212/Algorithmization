package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_2 {

    //Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[4];
        System.out.println("Введите 1 число : ");
        array[0] = getScan(scan);
        System.out.println("Введите 2 число : ");
        array[1] = getScan(scan);
        System.out.println("Введите 3 число : ");
        array[2] = getScan(scan);
        System.out.println("Введите 4 число : ");
        array[3] = getScan(scan);

        System.out.println("НОД: " + fourNOD(array));
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

    public static int fourNOD(int[] array) {
        int buffer = NOD(array[0], array[1]);
        for (int i = 2; i < 4; i++)
            buffer = NOD(buffer, array[i]);
        return buffer;
    }

    public static int NOD(int a, int b) {
        while (a != 0 & b != 0)
            if (a > b) a = a % b;
            else b = b % a;

        return a + b;
    }
}


