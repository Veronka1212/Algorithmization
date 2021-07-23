package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_8 {

    //Даны дроби p1/q1, p2/q2, p3/q3/.......pn/qn (p q - натуральные). Составить программу,
    // которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

    public static void main(String[] args) {
        Integer[] array = {4, 5, 7, 1, 9, 8, 2};
        Integer[] array2 = {3, 2, 1, 9, 3, 7, 3};
        Integer[] numerators = new Integer[array.length];
        int i = 0;
        System.out.print("Дроби: ");
        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + "/" + array2[i] + "   ");

        int numerator;
        int denominator;
        System.out.println();
        denominator = NOK(array2[0], array2[1], NOD(array2[0], array2[1]));
        for (i = 2; i < array2.length; i++) {
            denominator = NOK(denominator, array2[i], NOD(denominator, array2[i]));
        }
        System.out.println("Дроби с общим знаменателем по возрастанию: ");
        for (i = 0; i < array2.length; i++)
            numerators[i] = array[i] * (denominator / array2[i]);
        Arrays.sort(numerators);
        for (i = 0; i < array2.length; i++)
            System.out.print(numerators[i] + "/" + denominator + "   ");
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
