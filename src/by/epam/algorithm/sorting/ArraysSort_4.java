package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_4 {

    //. Сортировка выбором. Дана последовательность чисел a1 <= a2 <=... an. Требуется переставить
    // элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    // элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    // повторяется. Написать алгоритм сортировки выбором.


    public static void main(String[] args) {
        Integer[] array = {-2, 3, 7, 9, 11, 15, 20, 32, 50, 54, 77};
        System.out.println(Arrays.toString(array));
        Integer box = array[0];
        Integer maxim = 0;
        int index = 0;
        int k = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = k; i < 11; i++)
                if (array[i] > box) {
                    flag = true;
                    index = i;
                    box = array[i];
                }
            maxim = array[index];
            box = array[k];
            array[k] = maxim;
            array[index] = box;
            k++;
            box = array[k];
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));

    }
}