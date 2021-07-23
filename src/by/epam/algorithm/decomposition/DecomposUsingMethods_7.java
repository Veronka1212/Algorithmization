package by.epam.algorithm.decomposition;

public class DecomposUsingMethods_7 {

    //. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

    public static void main(String[] args) {
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 равна " + summOffactorials());
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++)
            f = f * i;
        return f;
    }

    public static int summOffactorials() {
        int sum = 0;
        int k = 1;
        while (k <= 9) {
            if (k % 2 != 0) sum = sum + factorial(k);
            k++;
        }
        return sum;
    }
}
