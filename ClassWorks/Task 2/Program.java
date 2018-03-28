{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf470
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red27\green31\blue34;\red244\green246\blue249;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh14980\viewkind0
\deftab720
\pard\pardeftab720\sl360\sa320\partightenfactor0

\f0\fs32 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import java.util.Scanner;\
class HomeWork \{ public static void main(String[] args) \{ Scanner scanner = new Scanner(System.in);\
\pard\pardeftab720\sl380\partightenfactor0

\f1\fs28 \cf2 \cb3     while (true) \{\
        System.out.println("MENU:");\
        System.out.println("1. Show in range");\
        System.out.println("2. Sum of numbers");\
        System.out.println("3. Sum of digits");\
        System.out.println("4. Exit");\
\
        int command = scanner.nextInt();\
\
        switch (command) \{\
            case 1: \{\
                int a = scanner.nextInt();\
                int b = scanner.nextInt();\
                int i;\
                int q;\
                if (a > b) \{\
                    i = b;\
                \}else\{\
                    i = a;\
                \}\
\
                if (a < b) \{\
                    q = b;\
                \}else\{\
                    q = a;\
                \}\
\
                for (int s = i; s <= q; s ++)\
                    if ( s % 2 == 0) \{\
                        System.out.println(" " + s);\
                    \}\
                break;\
            \}\
            case 2: \{\
                int a = scanner.nextInt();\
\
                for (int i = 0; i < a; i++)\{\
\
                    int b = scanner.nextInt();\
                \}\
                break;\
            \}\
            case 3: \{\
                int n = scanner.nextInt();\
                int sum = 0;\
\
                while(n != 0)\{\
\
                    sum += (n % 10);\
                    n/=10;\
                \}\
                System.out.println(sum + " ");\
                break;\
            \}\
            default: \{\
                System.exit(0);\
                break;\
            \}\
        \}\
    \}\
\}\
\pard\pardeftab720\sl360\partightenfactor0

\f0\fs32 \cf2 \cb1 \}\
}