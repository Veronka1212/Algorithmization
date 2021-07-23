package by.epam.algorithm.array;

public class Matrix_10 {

    //Найти положительные элементы главной диагонали квадратной матрицы.

    public static void main(String[] args) {
        int[][] array = new int[6][6];
        getRandom(array);
        System.out.print("Положительные элементы главной диагонали: ");
        elements(array);
    }

    public static int[][] getRandom(int[][] newArray) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                newArray[i][j] = (int) (Math.random() * 2 * 20 - 20);
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        return newArray;
    }

    public static void elements(int[][] array) {
        int k;
        int l;
        for (k = 0; k < array.length; k++)
            for (l = 0; l < array.length; l++)
                if ((k == l) & (array[k][l] > 0)) System.out.print(array[k][l] + "  ");
    }
}


