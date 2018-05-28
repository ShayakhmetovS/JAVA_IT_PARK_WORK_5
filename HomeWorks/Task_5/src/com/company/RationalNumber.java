package com.company;

import java.util.Random;

public class RationalNumber {

    int a, b;

    RationalNumber() {
        Random random = new Random();
        a = random.nextInt(15);
        b = random.nextInt(15);
    }

    RationalNumber(int x, int y) {
        x = a;
        y = b;
    }

    void Show(){
        System.out.println(a + "/" + b);
    }

    double toDouble() {
        return (double) a/b;
    }

    int nod(int x, int y) {
        x = a; y = b;
        while(x != 0 &&y != 0){
            if (x > y){
                x = x%y;
            }else{
                y = y%x;
            }
        }
        return x+y;
    }

    void optimize() {
        System.out.println(nod(a,b));
        System.out.println(a + "/" + b + " = " + a/nod(a, b) + "/" + b/nod(a, b) + " = " + toDouble());
    }
}
