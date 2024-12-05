import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options
        System.out.println("Console-based Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");

        // Read user choice
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Read two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculation
        double result = 0;
        boolean valid = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                valid = false;
        }

        // Display result if valid
        if (valid) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
