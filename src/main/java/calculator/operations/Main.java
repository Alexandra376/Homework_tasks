package calculator.operations;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите операцию (+, -, *, /): ");
            char operationSymbol = scanner.next().charAt(0);

            System.out.print("Введите первое число: ");
            double numberOne = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double numberTwo = scanner.nextDouble();

            Calculator calculator;

            switch (operationSymbol) {
                case '+':
                    calculator = new Calculator(new Addition());
                    break;
                case '-':
                    calculator = new Calculator(new Subtraction());
                    break;
                case '*':
                    calculator = new Calculator(new Multiplication());
                    break;
                case '/':
                    calculator = new Calculator(new Division());
                    break;
                default:
                    System.out.println("Ошибка: некорректная операция");
                    return;
            }

            double result = calculator.calculate(numberOne, numberTwo);
            System.out.printf("Результат: %.4f%n", result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите корректное значение");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

