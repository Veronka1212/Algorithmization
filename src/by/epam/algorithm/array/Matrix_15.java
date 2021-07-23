package by.epam.algorithm.array;

public class Matrix_15 {

    //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

    public static void main(String[] args) {
        Integer[][] array = new Integer[6][6];
        getRandom(array);
        replaceElements(array, maxElement(array));
        System.out.println("Матрица после замены:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
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

    public static int maxElement(Integer[][] array) {
        int i, j;
        int element = array[0][0];
        for (i = 0; i < 6; i++)
            for (j = 0; j < 6; j++)
                if (array[i][j] > element) element = array[i][j];
        return element;
    }

    public static Integer[][] replaceElements(Integer[][] array, int elem) {
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                if ((array[i][j] % 2) != 0) array[i][j] = elem;
        return array;
    }
}
