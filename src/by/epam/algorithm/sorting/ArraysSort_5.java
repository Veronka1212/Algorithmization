package by.epam.algorithm.sorting;

import java.util.Arrays;

public class ArraysSort_5 {

    // Сортировка вставками. Дана последовательность чисел a1,a2,...an.Требуется переставить числа в порядке
    //возрастания. Делается это следующим образом. Пусть a1,a2,...ai - упорядоченная последовательность, т. е. a1 <= a2 <= ....an
  //Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
  // Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание. Место помещения очередного
  // элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.


    public static void main(String[] args) {
        Integer[] array = {3, 5, 43, 2, 13, 67, 89, 5, 2, -3, -23, 0, 4, 29};
        sorting(array);
        System.out.println("Массив после сортировки: "+Arrays.toString(array));
    }
            public static void sorting (Integer[] array) {
                for (int i = 1; i < array.length; i++) {
                    int newElement = array[i];
                    int location = i - 1;
                    while (location >= 0 && array[location] > newElement) {
                        array[location + 1] = array[location];
                        location--;
                    }
                    array[location + 1] = newElement;
                }
            }
}
