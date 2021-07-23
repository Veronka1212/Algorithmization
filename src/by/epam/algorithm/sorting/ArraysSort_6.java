package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_6 {

    // Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    //Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
    // то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
    // на один элемент назад.Составить алгоритм этой сортировки.

    public static void main(String[] args) {
        Integer[] array = {6, -5, 43, 2, 13, 67, 89, 5, 2, -3, -23, 0, 4, 29};
        sort(array);
        System.out.println("Массив после сортировки: "+Arrays.toString(array));

    }

    public static Integer[] sort(Integer[] array) {
        Integer box = 0;
        int h = 0;
        while (h <= array.length / 3)
            h = 3 * h + 1;
        for (int k = h; k > 0; k = (k - 1) / 3)
            for (int i = k; i < array.length; i++) {
                box = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (box < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = box;
            }
        return array;
    }
}

