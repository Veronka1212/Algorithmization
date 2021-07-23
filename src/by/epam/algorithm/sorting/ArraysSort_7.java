package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_7 {

    //Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=... an и b1<=b2<=... bm
    //Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=... bm в первую
    //последовательность так, чтобы новая последовательность оставалась возрастающей.

    public static void main(String[] args) {
        Integer[] array = {4, 5, 7, 12, 23, 45, 65, 67, 70, 88, 102, 214};
        Integer[] array2 = {-33, -20, 0, 3, 10, 39, 69, 75, 82, 90, 102, 110, 215, 300};
        Integer[] bufferMassiv = new Integer[array.length + array2.length];
        System.arraycopy(array, 0, bufferMassiv, 0, array.length);
        System.arraycopy(array2, 0, bufferMassiv, array.length, array2.length);
        Arrays.sort(bufferMassiv);
        System.out.println(Arrays.toString(bufferMassiv));
        int index = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Элемент " + array2[i] + " вставляется перед ");
            index = Arrays.binarySearch(bufferMassiv, array2[i]);
            System.out.println(bufferMassiv[index + 1]);
        }
    }
}


