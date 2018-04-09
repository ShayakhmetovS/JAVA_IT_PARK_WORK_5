import java.util.Scanner;

class HomeWork_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Show in range");
            System.out.println("2. Sum of numbers");
            System.out.println("3. Sum of digits");
            System.out.println("4. Exit");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int i;
                    int q;
                    if (a > b) {
                        i = b;
                    }else{
                        i = a;
                    }

                    if (a < b) {
                        q = b;
                    }else{
                        q = a;
                    }

                    for (int s = i; s <= q; s ++)
                        if ( s % 2 == 0) {
                            System.out.println(" " + s);
                        }
                    break;
                }
                case 2: {
                    int a = scanner.nextInt();

                    for (int i = 0; i < a; i++){

                        int b = scanner.nextInt();
                    }
                    break;
                }
                case 3: {
                    int n = scanner.nextInt();
                    int sum = 0;

                    while(n != 0){

                        sum += (n % 10);
                        n/=10;
                    }
                    System.out.println(sum + " ");
                    break;
                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}