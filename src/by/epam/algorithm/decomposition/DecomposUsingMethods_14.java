package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_14 {

    //Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма
    // его цифр,возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
    // Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число K ");
        int k = getScan(scan);
        System.out.print("Числа Армстронга ");
        armstrong(k);
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
            System.out.println("Вы ввели неверное число");
        }
    }

    public static void armstrong(Integer k) {
        for (Integer i = 1; i < k; i++) {
            if (sumOfdigits(i.toString()).equals(i))
                System.out.print(i + "   ");
        }
    }

    public static Integer sumOfdigits(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++)
            sum = (int) (sum + Math.pow(Integer.parseInt(n.substring(i, i + 1)), n.length()));
        return sum;
    }
}
