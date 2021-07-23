package by.epam.algorithm.decomposition;

public class DecomposUsingMethods_5 {

    //Составить программу, которая в массиве A[N] находит второе по величине число
    // (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

    public static void main(String[] args) {
        int[] array = {3, 45, 32, 12, -4, 32, 5, 6, 57, 3, 6, 12, 22, 10, 99};
        System.out.println("Второй по величине элемент " + secondElement(array, maxElement(array)));
    }

    public static int maxElement(int[] array) {
        int max = array[0];
        int i = 0;
        for (i = 0; i < array.length; i++)
            if (array[i] > max) max = array[i];
        return max;
    }

    public static int secondElement(int[] array, int m) {
        int i = 0;
        int second = array[0];
        for (i = 0; i < array.length; i++)
            if (array[i] > second & array[i] < m) second = array[i];
        return second;
    }
}
