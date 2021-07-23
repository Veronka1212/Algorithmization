package by.epam.algorithm.array;

public class Matrix_13 {

    //Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

    public static void main(String[] args) {
        Integer[][] array = new Integer[6][6];
        getRandom(array);
        for (int i = 0; i < 6; i++)
            bubleSortIncrease(array, i);
        System.out.println("Матрица после сортировки по возрастанию эл-тов столбцов: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
        for (int i = 0; i < 6; i++)
            bubleSortDecrease(array, i);
        System.out.println("Матрица после сортировки по убыванию эл-тов столбцов: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
    }

    public static void bubleSortIncrease(Integer[][] array, int k) {
        boolean run = false;
        Integer box = 0;
        while (!run) {
            run = true;
            for (int j = 0; j < array.length - 1; j++)
                if (array[j][k] > array[j + 1][k]) {
                    run = false;
                    box = array[j][k];
                    array[j][k] = array[j + 1][k];
                    array[j + 1][k] = box;
                }
        }
    }

    public static void bubleSortDecrease(Integer[][] array2, int l) {
        boolean run2 = false;
        Integer box2 = 0;
        while (!run2) {
            run2 = true;
            for (int j = 0; j < array2.length - 1; j++)
                if (array2[j][l] < array2[j + 1][l]) {
                    run2 = false;
                    box2 = array2[j][l];
                    array2[j][l] = array2[j + 1][l];
                    array2[j + 1][l] = box2;
                }
        }
    }

    public static Integer[][] getRandom(Integer[][] newArray) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                newArray[i][j] = (int) (Math.random() * 2 * 20 - 20);
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        return newArray;
    }
}

