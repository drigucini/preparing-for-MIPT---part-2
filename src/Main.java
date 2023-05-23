import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
        task4();
        task5();
        task6();
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

    public static void task3 () {
        System.out.println("\nTask 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A:");
        int A = scanner.nextInt();
        int counter = 0;
        for (int i = 0; ; i++) {
            if (i * i < A) {
                counter++;
            }
            if (i * i >= A) {
                break;
            }
        }
        System.out.println(counter);

    }

    public static void task4 () {
        System.out.println("\nTask 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A:");
        List<Integer> denominators = new ArrayList<>();
        int A = scanner.nextInt();
        for (Integer i = 1; i < A; i++) {
            if (A % i == 0) {
                denominators.add(i);
            }
        }
        System.out.println(Collections.max(denominators));
    }

    public static void task5 () {
        System.out.println("\nTask 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A:");
        int A = scanner.nextInt();
        System.out.println("Input B:");
        int B = scanner.nextInt();

    }

    public static void task6 () {
        System.out.println("\nTask 6");
    }
}