package by.epam.algorithm.decomposition;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_12 {

    //Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
    // элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число K ");
        int k = getScan(scan);
        System.out.print("Введите число N ");
        int n = getScan(scan);
        String[] newArray = massiv(k, n).split("\s");
        System.out.println(Arrays.toString(newArray));
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

    public static String massiv(int k, int n) {
        Integer x = 0;
        Integer sum = 0;
        String box;
        String a = "";
        while (x < n) {
            sum = 0;
            for (int i = 0; i < x.toString().length(); i++) {
                box = x.toString().substring(i, i + 1);
                sum = sum + Integer.parseInt(box);
            }
            if (sum.equals(k)) {
                a = a.concat(x.toString()).concat(" ");
            }
            x++;
        }
        return a;
    }
}
