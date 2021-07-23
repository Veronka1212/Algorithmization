package by.epam.algorithm.decomposition;

import java.util.Scanner;

public class DecomposUsingMethods_3 {

    // Вычислить площадь правильного шестиугольника со стороной а,
    // используя метод вычисления площадь треугольника


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a=scan.nextDouble();
        System.out.println("Площадь треугольника "+squareTriangle(a));

    }
    public static double squareTriangle (double a) {
        double sq = (Math.sqrt(3) * a * a) / 4;
        return sq;
    }
}
