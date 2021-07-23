package by.epam.algorithm.decomposition;

public class DecomposUsingMethods_4 {

    //На плоскости заданы своими координатами n точек. Написать метод(методы),
    // определяющие, между какими из пар точек самое большое расстояние. Указание.
    // Координаты точек занести в массив.

    public static void main(String[] args) {
        int[] dots = {10, 5, 24, 12, -4, -8, 0, 6, -12, 4};
        int[] box = new int[4];
        int i = 0;
        int j = 0;
        double max = 0;
        while (i < dots.length) {
            int a = dots[i];
            int b = dots[i + 1];
            for (j = i + 2; j < dots.length - 3; j++)
                if (line(a, b, dots[j + 2], dots[j + 3]) > max) {
                    max = line(a, b, dots[j + 2], dots[j + 3]);
                    box[0] = a;
                    box[1] = b;
                    box[2] = dots[j + 2];
                    box[3] = dots[j + 3];
                }
            i = i + 2;
        }
        System.out.println("Наибольшее расстояние " + max + " между точками " + box[0] + "," + box[1] + " и " + box[2] + "," + box[3]);
    }

    public static double line(int a, int b, int c, int d) {
        double AB = Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));
        return AB;
    }
}
