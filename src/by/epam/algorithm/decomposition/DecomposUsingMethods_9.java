package by.epam.algorithm.decomposition;

import java.util.Scanner;

public class DecomposUsingMethods_9 {

    //Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления
    // его площади, если угол между сторонами длиной X и Y— прямой.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стороны четырехугольника через Enter ");
        double x = getScan(scan);
        double y = getScan(scan);
        double z = getScan(scan);
        double t = getScan(scan);
        System.out.println("Площадь четырехугольника равна " + square(x, y, z, t));
    }

    private static double getScan(Scanner scan) {
        double k;
        while (true) {
            try {
                k = Double.parseDouble(scan.next());
                if (k > 0) {
                    return k;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели отрицательное число или 0, прочитайте условия");
        }
    }

    public static double square(double x, double y, double z, double t) {
        double perimetr = 0;
        double sq = 0;
        double diagonal = Math.sqrt(x * x + y * y);
        perimetr = (diagonal + z + t) / 2;
        sq = Math.sqrt(perimetr * (perimetr - diagonal) * (perimetr - z) * (perimetr - t)) + x * y / 2;
        return sq;
    }
}
