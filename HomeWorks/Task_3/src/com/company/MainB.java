package com.company;

import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w,e;

        System.out.println("Введите количество строк");
        w = scanner.nextInt();
        System.out.println("Введите количество стобцов");
        e = scanner.nextInt();

        int m = 1;

        int matrix[][] = new int[w][e];

        for (int i = 0; i < matrix.length ; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = m;
                    m++;
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--){
                    matrix[i][j] = m;
                    m++;
                }
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
