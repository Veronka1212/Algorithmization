package by.epam.algorithm.array;

import java.util.Scanner;
//НЕ СДЕЛАНА
public class Matrix_16 {

    //Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
    //...,2n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны междусобой.
    //Построить такой квадрат
    
        public static void main(String[] args) {
            System.out.print("Введите n ");
            int n = getNumber();
            Integer[] oneDimensionalArray = new Integer[(int) Math.pow(n,2)];
            for (int i = 0; i <= Math.pow(n,2); i++)
                oneDimensionalArray[i]=i;
            Integer[][] twoDimensionalArray=new Integer[n][n];
            boolean isDone=true;
            while (isDone)
                for (int a=0;a<Math.pow(n,2);a++)
                    for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++)
                        twoDimensionalArray[i][j]=oneDimensionalArray[a];

        }
        public static int sumRow (Integer[][] array,int k,int m){
            int sum=0;
            for (int i=0;i<m;i++)
                sum=sum+array[i][k];
            return sum;
        }
    public static int sumColumn (Integer[][] array,int l,int m){
        int sum=0;
        for (int i=0;i<m;i++)
            sum=sum+array[l][i];
        return sum;
    }
    public static int sumDiagonal1 (Integer[][] array,int m){
        int sum=0;
        for (int i = 0; i < m; i++)
            sum=sum+array[i][i];
        return sum;
    }
    public static int sumDiagonal2 (Integer[][] array,int m){
        int sum=0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < m; j++)
            if (i+j==m-1) sum=sum+array[i][j];
        return sum;
    }
    public static int getNumber() {
        Scanner scan=new Scanner(System.in);
        if (scan.hasNextInt())
            return scan.nextInt();
        else System.out.println("Вы ввли неверне данные, повторите ввод");
        return getNumber();
    }

}
