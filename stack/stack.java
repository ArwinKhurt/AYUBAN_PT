package repo.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> basket = new ArrayDeque<>();
        System.out.print("How many fruits would you like to catch? ");
        int numFruits = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numFruits; i++) {
            System.out.print("Choose a fruit (A for apple, O for orange, M for mango, G for guava): ");
            String fruit = scanner.nextLine().toUpperCase();

            if (fruit.matches("[AOMG]")) {
                basket.addLast(fruit);
            } else {
                System.out.println("Invalid fruit choice. Please try again.");
            }
        }

        System.out.println("Fruits in your basket: " + basket);

        while (!basket.isEmpty()) {
            System.out.print("Enter E to start eating a fruit: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("E")) {
                String eatenFruit = basket.removeFirst();
                System.out.println("You ate a " + eatenFruit + ".");
                System.out.println("Fruits remaining: " + basket);
            } else {
                System.out.println("Invalid input. Please enter E to eat a fruit.");
            }
        }

        System.out.println("No more fruits in your basket.");
    }
}