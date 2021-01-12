package com.company;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double determinant;
        double firstRoot;
        double secondRoot;

        boolean solveMore = true;

        do {
            System.out.println("Please enter the value for 'a'");
            while (!scanner.hasNextDouble()) {
                System.out.println("Dear sir, please be so kind to enter a number.");
                scanner.next();
            }
            a = scanner.nextDouble();

            if (a == 0) {
                System.out.println("Ъуъуъуъ съука!\n" +
                        "'a' mustn't be equal to zero!!!11");
                continue;
            }

            System.out.println("Please enter the value for 'b'");
            while (!scanner.hasNextDouble()) {
                System.out.println("Dear sir, please be so kind to enter a number.");
                scanner.next();
            }
            b = scanner.nextDouble();
            System.out.println("Please enter the value for 'c'");

            while (!scanner.hasNextDouble()) {
                System.out.println("Dear sir, please be so kind to enter a number.");
                scanner.next();
            }
            c = scanner.nextDouble();

            System.out.println("Thank you!\n" +
                    "First of all, we need to define the determinant of the equation.\n" +
                    "The magic formula 'b^2 - 4ac' should help.");

            determinant = (b * b) - (4 * a * c);

            if (determinant > 0) {
                System.out.println("So here we have the determinant greater than 0.\n" +
                        "This means that the equation has two square roots.\n" +
                        "Let's find out the first root using the formula: (-b + √D) / (2a).");
                firstRoot = (-b + Math.sqrt(determinant)) / (2 * a);
                System.out.println("Then, we need to get the second root using the formula: (-b - √D) / (2a).");
                secondRoot = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.println("Therefore, the answers are: " + firstRoot + " is the first root, and " + secondRoot + " is the second one.");
            }

            if (determinant == 0) {
                System.out.println("So here we have the determinant equal to 0.\n" +
                        "This means that the equation has only one square root.\n" +
                        "Let's find it out using the formula: (-b + √D) / (2a).");
                firstRoot = (-b + Math.sqrt(determinant)) / (2 * a);
                System.out.println("The answer is: " + firstRoot);
            }

            if (determinant < 0) {
                System.out.println("The determinant is lesser than 0, so there are no square roots in the equation.");
            }

            System.out.println("\nWould you like to solve one more equation?\n(Please answer 'Yes' or 'No')");

            if (scanner.next().equalsIgnoreCase("No")) {
                solveMore = false;
            } else {
                System.out.println("You are welcome!\n");
            }
        } while (solveMore);
    }
}
