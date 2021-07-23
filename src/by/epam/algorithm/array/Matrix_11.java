package by.epam.algorithm.array;

public class Matrix_11 {

    //Матрицу 10x20 заполнить случайными числами от 0 до 15.
    // Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.


    public static void main(String[] args) {
        int[][] array = new int[10][20];
        getRandom(array);
        System.out.print("Номера строк, в которых 5 повторяется три и больше раз: ");
        for (int i = 0; i < 10; i++)
            if (fives(array, i) >= 3) System.out.print((i + 1) + "   ");
    }

    public static int[][] getRandom(int[][] newArray) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                newArray[i][j] = (int) (Math.random() * 15);
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        return newArray;
    }

    public static int fives(int[][] array, int k) {
        int flag = 0;
        for (int j = 0; j < 20; j++)
            if (array[k][j] == 5) flag++;
        return flag;
    }
}
