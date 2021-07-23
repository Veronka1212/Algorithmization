package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_3 {

    //Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ....an.Требуется переставить числа в
    // порядке возрастания. Для этого сравниваются два соседних числа i i+1 a и a. Если ai  ai+1, то делается
    //перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    //Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

    public static void main(String[] args) {
        Integer[] array = {1, 3, 7, 10, 11, 15, 20, 35, 50, 54, 67};
        System.out.println(Arrays.toString(array));
        boolean flag = true;
        Integer box = 0;
        int replace = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    box = array[i];
                    array[i] = array[i + 1];
                    replace++;
                    array[i + 1] = box;
                    flag = true;
                }
            }
        }
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Количество перестановок " + replace);

    }
}
