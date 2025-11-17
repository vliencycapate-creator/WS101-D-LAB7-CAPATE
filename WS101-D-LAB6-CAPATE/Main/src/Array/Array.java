package Array;

import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 3. Array
        int[] numbers = new int[5];
        int sum = 0;

        IO.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = sum / 5.0;

        IO.println("Sum = " + sum);
        IO.println("Average = " + average + "\n");
    }
}
