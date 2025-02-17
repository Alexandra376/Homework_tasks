import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created on 18.02.25
 * @author Aleksandra Suvorova
 * @see #summation(double, double)
 * @see #subtraction(double, double)
 * @see #multiply(double, double)
 * @see #division(double, double)
 */

public class Calculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            double numberOne = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double numberTwo = scanner.nextDouble();

            System.out.printf("Сложение: %.4f%n", summation(numberOne, numberTwo));
            System.out.printf("Вычитание: %.4f%n", subtraction(numberOne, numberTwo));
            System.out.printf("Умножение: %.4f%n", multiply(numberOne, numberTwo));

            try {
                System.out.printf("Деление: %.4f%n", division(numberOne, numberTwo));
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите корректное число");
        } finally {
            scanner.close();
        }
    }

    public static double summation(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public static double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public static double division(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return numberOne / numberTwo;
    }

}
