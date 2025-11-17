package Fibonacci;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2. Fibonacci
        IO.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        IO.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            IO.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        IO.println("\n");
    }
}
