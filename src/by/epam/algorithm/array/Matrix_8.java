package by.epam.algorithm.array;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Matrix_8 {

    //В числовой матрице поменять местами два столбца любых столбца, т. е.
    // все элементы одного столбца поставитьна соответствующие им позиции другого, а его элементы
    // второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество столбцов матрицы ");
        int x = getScan(scan);
        System.out.print("Введите количество строк матрицы ");
        int y = getScan(scan);
        System.out.print("Введите номер первого столбца ");
        int a = getScan(scan);
        System.out.print("Введите номер второго столбца ");
        int b = getScan(scan);
        if ((a > x) || (b > x)) {
            System.out.println("Введены значения, превышающие размер матрицы");
            System.exit(0);
        }
        System.out.println("Матрица до замены:");
        Integer array[][] = new Integer[x][y];
        getRandom(array,x,y);
        int box = 0;
        System.out.println("Матрица после замены:");
        extracted(a, b, array,x);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }
    }

    private static void extracted(int a, int b, Integer[][] array,int x) {
        int box;
        for (int k = 0; k < x; k++) {
            box = array[k][a];
            array[k][a] = array[k][b];
            array[k][b] = box;
        }
    }

    private static int getScan(Scanner scan) {
        int n;
        while (true) {
            try {
                n = parseInt(scan.next());
                if (n > 0 & n % 1 == 0) {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели неверное число, введите натуральное");
        }
    }

    public static Integer[][] getRandom(Integer[][] newArray,int x,int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newArray[i][j] = (int) (Math.random() * 2 * 20 - 20);
                System.out.print(newArray[i][j] + "     ");
            }
            System.out.println();
        }
        return newArray;
    }
}
