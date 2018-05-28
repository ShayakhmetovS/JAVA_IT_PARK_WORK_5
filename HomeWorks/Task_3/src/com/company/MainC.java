package com.company;
import java.util.Scanner;
import java.util.Random;

public class MainC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int a = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int b = scanner.nextInt();

        Random random = new Random();

        int matrix[][] = new int[a][b];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <matrix.length; i++){
            int min = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" " + " - минимальное значение: " + min);
            System.out.println();
        }
    }
}
