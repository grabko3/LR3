package org.example;
import java.util.Scanner;

class FibActions {
    static int computeWithCycle(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
    static int computeWithRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return computeWithRecursion(n - 1) + computeWithRecursion(n - 2);
        }
    }
}
class FactActions {
    static int computeWithCycle(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    static int computeWithRecursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * computeWithRecursion(n - 1);
        }
    }
}
class SumDigits {
    static int compute(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + compute(n / 10);
    }
}
class SumNumbers {
    static int compute(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return compute(a ^ b, (a & b) << 1);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число n:");
        int n = scanner.nextInt();
        System.out.println("Введіть число a:");
        int a = scanner.nextInt();
        System.out.println("Введіть число b:");
        int b = scanner.nextInt();
        System.out.println("Факторіал числа " + n + ": " + FactActions.computeWithCycle(n));
        System.out.println("Число Фібоначчі номер " + n + ": " + FibActions.computeWithCycle(n));
        System.out.println("Сума цифр числа " + n + ": " + SumDigits.compute(n));
        System.out.println("Сума чисел " + a + " і " + b + ": " + SumNumbers.compute(a, b));
    }
}
