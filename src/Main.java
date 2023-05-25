import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
    }

//    public static void task1 () {
//        System.out.println("Task 1");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input A:");
//        int A = scanner.nextInt();
//        System.out.println("Input B:");
//        int B = scanner.nextInt();
//        int number = A;
//
//        for (int i = 0; i < B; i++) {
//            number *= A;
//            i++;
//        }
//        System.out.println("A in the power of B is " + number);
//    }
//
//    public static void task2 () {
//        System.out.println("\nTask 2");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input A:");
//        int A = scanner.nextInt();
//        for (int i = 1; i <= 1000; i++) {
//            if (i % A == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }

//    public static void task3 () {
//        System.out.println("\nTask 3");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input A:");
//        int A = scanner.nextInt();
//        int counter = 0;
//        for (int i = 0; ; i++) {
//            if (i * i < A) {
//                counter++;
//            }
//            if (i * i >= A) {
//                break;
//            }
//        }
//        System.out.println(counter);
//
//    }
//
//    public static void task4 () {
//        System.out.println("\nTask 4");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input A:");
//        List<Integer> denominators = new ArrayList<>();
//        int A = scanner.nextInt();
//        for (Integer i = 1; i < A; i++) {
//            if (A % i == 0) {
//                denominators.add(i);
//            }
//        }
//        System.out.println(Collections.max(denominators));
//    }

//    public static void task5() {
//        System.out.println("\nTask 5");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input A:");
//        int A = scanner.nextInt();
//        System.out.println("Input B:");
//        int B = scanner.nextInt();
//        int sum = 0;
//        if (A > B) {
//            for (int i = B; i <= A; i++) {
//                if (i % 7 == 0) {
//                    sum += i;
//                }
//            }
//            System.out.println("The sum is " + sum);
//        } else if (A < B) {
//            for (int i = A; i <= B; i++) {
//                if (i % 7 == 0) {
//                    sum += i;
//                }
//            }
//            System.out.println("The sum is " + sum);
//        } else {
//            if (A % 7 == 0) {
//                sum = A;
//            }
//            System.out.println("The sum is " + sum);
//        }
//
//    }
//
//    public static void task6() {
//        System.out.println("\nTask 6");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input N:");
//        int N = scanner.nextInt();
//        int n0 = 1;
//        int n1 = 1;
//        int n2 = n0 + n1;
//
//        for (int i = 2; i <= N; i++) {
//            n0 = n1;
//            n1 = n2;
//            n2 = n0 + n1;
//            if (i == N) {
//                System.out.println("The N-th fibonacci number is " + n2);
//            }
//        }
//    }
//
//    public static void task7() {
//        System.out.println("\nTask 7");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input A:");
//        int A = scanner.nextInt();
//        System.out.println("Input B:");
//        int B = scanner.nextInt();
//        int b = B;
//        int a = 5;
//        if (A > B) {
//            while ( a > 0) {
//                a = A%b;
//                b = b;
//            }
//        }
//
//    }

    public static void task8() {
        System.out.println("\nTask 8");
    }

    public static void task9() {
        System.out.println("\nTask 9");
    }

    public static void task10() {
        System.out.println("\nTask 10");
    }

    public static void task11() {
        System.out.println("\nTask 11");
    }

    public static void task12() {
        System.out.println("\nTask 12");
    }

    public static void task13() {
        System.out.println("\nTask 13");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (1 + 1 / (n * n));
        }
        System.out.println(sum);
    }

    public static void task14() {
        System.out.println("\nTask 14");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scanner.nextInt();
        System.out.println("Input x:");
        int x = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <= n; i++) {
            int temp = 1/(x + i);
            sum1 += 1/(x+ i);
        }
        System.out.println(sum1);

        for (int i = 0; i <= n; i++) {
            sum2 += x*x*x*x;
        }
    }

    public static void task15() {
        System.out.println("\nTask 15");
    }

    public static void task16() {
        System.out.println("\nTask 16");
    }

    public static void task17() {
        System.out.println("\nTask 17");
    }

    public static void task18() {
        System.out.println("\nTask 18");
    }

    public static void task19() {
        System.out.println("\nTask 19");
    }

    public static void task20() {
        System.out.println("\nTask 20");
    }

    public static void task21() {
        System.out.println("\nTask 21");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k:");
        int k = scanner.nextInt();
        int number = 0;

        for (int i = 1; i <= k; i++) {
            number = i;
        }
        System.out.println("The k-th number of the given series is " + number);
    }

    public static void task22() {
        System.out.println("\nTask 22");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k:");
        int k = scanner.nextInt();
        int number = 0;
        for (int i = 1; i <= k; i++) {
            number = i*i;
        }
        System.out.println("The k-th number of the given series is " + number);
    }

    public static void task23() {
        System.out.println("\nTask 23");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k:");
        int k = scanner.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2 = n0 + n1;

        for (int i = 2; i <= k; i++) {
            n0 = n1;
            n1 = n2;
            n2 = n0 + n1;
            if (i == k) {
                System.out.println("The k-th fibonacci number is " + n2);
            }
        }

    }

}