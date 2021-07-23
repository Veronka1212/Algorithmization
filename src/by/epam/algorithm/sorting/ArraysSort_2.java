package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_2 {

    //. Даны две последовательность a1 < a2 <= an и b1 < b2 <= bm
    // Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей

    public static void main(String[] args) {
        Integer[] array1 = {2, 5, 7, 9, 11, 34, 56, 78, 80};
        Integer[] array2 = {1, 3, 7, 10, 11, 15, 20, 35, 50, 54, 67};
        Integer[] summArrays = new Integer[array1.length + array2.length];
        System.arraycopy(array2, 0, summArrays, 0, array2.length);
        System.arraycopy(array1, 0, summArrays, array2.length, array1.length);

        boolean flag = true;
        Integer box = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < summArrays.length - 1; i++) {
                if (summArrays[i] > summArrays[i + 1]) {
                    box = summArrays[i];
                    summArrays[i] = summArrays[i + 1];
                    summArrays[i + 1] = box;
                    flag = true;
                }
            }
        }
        System.out.println("Новая последовательность: "+Arrays.toString(summArrays));
    }
}
