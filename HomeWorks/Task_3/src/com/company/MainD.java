package com.company;

import java.util.Random;
import java.util.Scanner;

public class MainD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер квадратной матрицы");
        int m = scanner.nextInt();
        int matrix[][] = new int[m][m];

        Random random = new Random();

        System.out.println("Исходная рандомная матрица:");
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            sum = sum + matrix[i][matrix.length-1-i];
        }

        System.out.println();
        System.out.println("Сумма элементов побочной диагонали:");
        System.out.println(sum);
    }
}