package com.company;
import java.util.Scanner;
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int w = scanner.nextInt();

        int a[] = new int[w];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < a.length; i++){
                int c = scanner.nextInt();
                a[i] = c;
        }


        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length ; j++) {
                if (a[i] == a[j]){
                    a[i] = 0;
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
