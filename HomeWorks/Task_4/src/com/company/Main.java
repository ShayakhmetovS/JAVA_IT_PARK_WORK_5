package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        System.out.println("Результат: " + charArrayToInt(scanner.nextLine().toCharArray()));
    }

    public static int charArrayToInt(char[] chars) {
        double result = 0;
        double n = Math.pow(10, chars.length - 1);
        for (char c : chars) {
            result = result + ((int) c - 48) * n;
            n = n / 10;
        }
        return (int) result;
    }
}