package by.epam.algorithm.decomposition;

import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_13 {

    //Два простых числа называются «близнецами», если они отличаются друг от друга на 2
    // (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n -
    // заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N ");
        int n = getScan(scan);
        System.out.println("Простые числа 'близнецы': ");
        printCouples(arrayCouples(n));
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

    public static void printCouples(ArrayList<Integer> couples) {
        int j = 0;
        for (int i = 0; i < couples.size() - 1; i++) {
            if ((couples.get(i + 1) - (couples.get(i))) == 2)
                System.out.println(couples.get(i) + "  " + couples.get(i + 1));
        }
    }

    public static boolean primeNumber(int k) {
        boolean flag = true;
        int f = 0;
        if (k % 2 == 0) return false;
        for (int i = 1; i <= k; i++)
            if (k % i == 0) f++;
        if (f > 2) flag = false;
        return flag;
    }

    public static ArrayList<Integer> arrayCouples(int n) {
        ArrayList<Integer> couples = new ArrayList<Integer>();
        for (int i = n; i <= 2 * n; i++)
            if (primeNumber(i)) couples.add(i);
        return couples;
    }
}
