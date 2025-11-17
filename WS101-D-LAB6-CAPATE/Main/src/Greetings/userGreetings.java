package userGreetings;

import java.util.*;

public class userGreetings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. User Greetings
        IO.print("Enter your name: ");
        String name = sc.nextLine();

        IO.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        IO.println("Hello " + name + "! You are " + age + " years old.\n");
    }
}
