package Palindrome;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 4. PALINDROME CHECK
        IO.print("Enter a text: ");
        String text = sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversed)) {
            IO.println(text + " is a palindrome.\n");
        } else {
            IO.println(text + " is NOT a palindrome.\n");
        }
    }
}
