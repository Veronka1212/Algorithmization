package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_1 {

    //Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
    // включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.

    public static void main(String[] args) {
        Integer[] array1 = new Integer[5];
        Integer[] array2 = new Integer[10];
        getRandom(array1);
        System.out.println();
        getRandom(array2);
        System.out.println();
        Integer[] arraysSum = new Integer[array1.length+array2.length];
        int k = 3;
        System.arraycopy(array1, 0, arraysSum, 0, k);
        System.arraycopy(array2, 0, arraysSum, k, array2.length);
        System.arraycopy(array1, k, arraysSum, array2.length + k, array1.length - k);
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(arraysSum));
    }

    public static Integer[] getRandom(Integer[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 2 * 20 - 20);
            System.out.print(newArray[i] + "  ");
        }
        return newArray;
    }
}
