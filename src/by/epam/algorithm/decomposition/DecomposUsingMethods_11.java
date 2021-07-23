package by.epam.algorithm.decomposition;

import java.util.Scanner;

public class DecomposUsingMethods_11 {

    //Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число ");
        String a = scan.nextLine();
        System.out.print("Введите второе число ");
        String b = scan.nextLine();
        comparison(a, b);
    }

    public static void comparison(String a, String b) {
        int negative = 0;
        int negative2 = 0;
        int dot = 0;
        int dot2 = 0;
        if (a.contains("-")) {
            negative++;
        }
        if (b.contains("-")) {
            negative2++;
        }
        if (a.contains(".")) {
            dot++;
        }
        if (b.contains(".")) {
            dot2++;
        }
        if (a.length() - negative - dot > b.length() - negative2 - dot2)
            System.out.println("В первом числе больше цифр");
        if (a.length() - negative - dot < b.length() - negative2 - dot2)
            System.out.println("Во втором числе больше цифр");
        if (a.length() - negative - dot == b.length() - negative2 - dot2)
            System.out.println("В числах одинаковое количество цифр");
    }
}
