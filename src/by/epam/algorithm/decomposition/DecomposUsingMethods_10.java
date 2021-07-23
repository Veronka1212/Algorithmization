package by.epam.algorithm.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class DecomposUsingMethods_10 {

    //Дано натуральное число N. Написать метод(методы) для формирования массива,
    // элементами которого являются цифры числа N.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N ");
        long n = getScan(scan);
        System.out.println(Arrays.toString(massiv(Long.toString(n))));
    }

    private static long getScan(Scanner scan) {
        long n;
        while (true) {
            try {
                n = Long.parseLong(scan.next());
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

    public static String[] massiv(String n) {
        String[] array = new String[n.length()];
        for (int i = 0; i < n.length(); i++)
            array[i] = n.substring(i, i + 1);
        return array;
    }
}
