package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_17 {

    //Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    // Сколько такиx действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите заданное число ");
        Integer n = getScan(scan);
        int flag = 0;
        while (n != 0) {
            n = n - sumOfdigits(n.toString());
            flag++;
        }
        System.out.println("Операция была выполнена " + flag + " раз(а)");
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
            System.out.println("Вы ввели неверное число, для решения данной задачи необходимо целое положительное число");
        }
    }

    public static Integer sumOfdigits(String n) {
        Integer sum = 0;
        for (Integer i = 0; i < n.length(); i++)
            sum = sum + Integer.parseInt(n.substring(i, i + 1));
        return sum;
    }
}
