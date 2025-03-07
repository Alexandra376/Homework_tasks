package calculator.operations;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.next();

            System.out.print("Введите первое число: ");
            double numberOne = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double numberTwo = scanner.nextDouble();

            double result = calculator.calculate(operation, numberOne, numberTwo);
            System.out.printf("Результат: %.4f%n", result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
