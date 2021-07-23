package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_16 {

    //Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    //Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n (если введенное число будет больше 8 - ждать придется долго) ");
        Integer n = scan.nextInt();
        System.out.println("Сумма равна " + outputNumbers(n) + ", количество чётных цифр в ней " + evenNumbers(outputNumbers(n).toString()));
    }

    private static int getScan(Scanner scan) {
        int n;
        while (true) {
            try {
                n = parseInt(scan.next());
                if (n > 0 & n % 1 == 0 & n<=10) {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели неверное число, введите натуральное");
        }
    }
    public static Long outputNumbers(Integer n) {
        Integer i;
        Long sum = Long.valueOf(0);
        for (i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++)
            if (definitionOfAnOddNumber(i.toString()))
                sum = (long) sum + i;
        return sum;
    }

    public static boolean definitionOfAnOddNumber(String k) {
        boolean flag = true;
        Integer i = 0;
        for (i = 0; i < k.length(); i++) {
            if (Integer.parseInt(k.substring(i, i + 1)) % 2 == 0)
                flag = false;
        }
        return flag;
    }

    public static int evenNumbers(String s) {
        int flag = 0;
        Integer i = 0;
        for (i = 0; i < s.length(); i++) {
            if (Integer.parseInt(s.substring(i, i + 1)) % 2 == 0 & Integer.parseInt(s.substring(i, i + 1)) != 0)
                flag++;
        }
        return flag;
    }
}
