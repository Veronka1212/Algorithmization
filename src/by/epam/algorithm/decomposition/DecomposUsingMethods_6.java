package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_6 {

    //Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 число : ");
        int a = getScan(scan);
        System.out.println("Введите 2 число : ");
        int b = getScan(scan);
        System.out.println("Введите 3 число : ");
        int c = getScan(scan);
        if (NOD(a, b) == 1 & NOD(b, c) == 1 & NOD(a, c) == 1) System.out.println("Числа взаимно простые");
        else System.out.println("Числа НЕ взаимно простые");
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

    public static int NOD(int a, int b) {
        while (a != 0 & b != 0)
            if (a > b) a = a % b;
            else b = b % a;

        return a + b;
    }
}
