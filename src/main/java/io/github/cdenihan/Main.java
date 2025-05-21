package io.github.cdenihan;

import java.util.Scanner;

public class Main {

    private static final String INVALID_OPERATION_MESSAGE = "Invalid operation";
    private static final String RESULT_MESSAGE = "The result is: ";

    public static void main(String[] args) {
        printWelcomeMessages();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        double firstNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your second number:");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your operation (+, -, *, /):");
        String operation = scanner.nextLine();

        double result = calculate(firstNumber, secondNumber, operation);

        if (Double.isNaN(result)) {
            System.out.println(INVALID_OPERATION_MESSAGE);
        } else {
            System.out.println(RESULT_MESSAGE + result);
        }
    }

    private static void printWelcomeMessages() {
        System.out.println("Hello and welcome!");
        System.out.println("Welcome to Java!");
        System.out.println("This is my first Java program!");
        System.out.println("Welcome to my calculator!");
    }

    private static double calculate(double firstNumber, double secondNumber, String operation) {
        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> secondNumber != 0 ? firstNumber / secondNumber : Double.NaN;
            default -> Double.NaN;
        };
    }
}