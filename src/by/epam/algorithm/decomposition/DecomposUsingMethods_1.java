package by.epam.algorithm.decomposition;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecomposUsingMethods_1 {

    //Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    //натуральных чисел: (НОК(А,В)=А*В/(НОД(А,В)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите А : ");
        int a = getScan(scan);
        System.out.println("Введите В : ");
        int b = getScan(scan);
        System.out.println("НОД: " + NOD(a, b));
        System.out.println("НОК: " + NOK(a, b, NOD(a, b)));
    }
    private static int getScan (Scanner scan) {
        int n;
        while (true) {
            try {
                n = parseInt(scan.next());
                if (n >0 & n%1==0) {
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

    public static int NOK(int a, int b, int nod) {
        int n = a * b / nod;
        return n;
    }
}

