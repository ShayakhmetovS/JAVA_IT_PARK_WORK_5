package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        while (a != 0){
            b = a % 2;
            System.out.print(b);
            a = a / 2;
        }
    }
}
