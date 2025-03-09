package calculator.operations;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();

        try {
            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.next();

            System.out.print("Введите первое число: ");
            double numberOne = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double numberTwo = scanner.nextDouble();

            double result = calculatorController.calculate(numberOne, numberTwo, operation);

            System.out.printf("Результат: %.4f%n", result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
