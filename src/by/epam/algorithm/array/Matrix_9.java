package by.epam.algorithm.array;

public class Matrix_9 {

    //Задана матрица неотрицательных чисел.
    // Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

    public static void main(String[] args) {
        int[][] array = new int[6][6];
        getRandom(array);
        int maxSum = getSum(array, 0);
        int flag = 0;
        System.out.println("Суммы столбцов: ");
        for (int k = 0; k < 6; k++) {
            System.out.print(getSum(array, k) + "      ");
            if (getSum(array, k) >= maxSum) {
                maxSum = getSum(array, k);
                flag = k + 1;
            }
        }
        System.out.println("Максимальная сумма " + maxSum + ", cтолбец номер " + flag);
    }

    public static int[][] getRandom(int[][] newArray) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                newArray[i][j] = (int) (Math.random() * 2 * 5);
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        return newArray;
    }

    public static int getSum(int[][] array, int j) {
        int sum = 0;
        for (int i = 0; i < 6; i++)
            sum = sum + array[i][j];
        return sum;
    }

}
