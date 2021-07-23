package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_15 {

    //Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    //последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n ");
        Integer n = getScan(scan);
        outputNumbers(n);
    }

    private static int getScan(Scanner scan) {
        int n;
        while (true) {
            try {
                n = parseInt(scan.next());
                if (n > 0 & n % 1 == 0 & n<=19) {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели неверное число, введите натуральное");
        }
    }

    public static void outputNumbers(Integer n) {
        long i=0;
        for (i = (long) Math.pow(10, n-1); i < (long) Math.pow(10, n); i++) {
            if (ascendingSeries(Long.toString(i))) {
                System.out.println(i + "  ");
            }
        }
    }

    public static boolean ascendingSeries(String k) {
        boolean flag = true;
        int i = 0;
        for (i = 0; i < k.length() - 1; i++) {
            if (Integer.parseInt(k.substring(i, i + 1)) >= Integer.parseInt(k.substring(i + 1, i + 2)))
                flag = false;
        }
        return flag;
    }
}
