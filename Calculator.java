package latihan.dasar;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Java Calculator");
        System.out.println("----------------------\n");
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter the 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                return;
        }

        System.out.println("\n----------------------");
        System.out.println("Result: " + result);
    }
}

