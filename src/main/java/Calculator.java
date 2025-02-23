import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число операции: (1 - калькулятор, 2 - массив строк): ");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.print("Введите первое число: ");
                double numberOne = scanner.nextDouble();

                System.out.print("Введите второе число: ");
                double numberTwo = scanner.nextDouble();

                System.out.printf("Сложение: %.4f%n", summation(numberOne, numberTwo));
                System.out.printf("Вычитание: %.4f%n", subtraction(numberOne, numberTwo));
                System.out.printf("Умножение: %.4f%n", multiply(numberOne, numberTwo));

                try {
                    System.out.printf("Деление: %.4f%n", division(numberOne, numberTwo));
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else {
                System.out.print("Введите размер массива: ");
                int sizeOfArray = scanner.nextInt();
                String[] wordsArray = new String[sizeOfArray];

                for (int i = 0; i < wordsArray.length; i++) {
                    System.out.printf("Введите слово %d: ", i + 1);
                    wordsArray[i] = scanner.next();
                }

                String maxWord = printWordWithMaxSize(wordsArray);
                System.out.printf("Самое длинное слово: %s%n", maxWord);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите корректное значение");
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

    public static String printWordWithMaxSize(String[] wordsArray) {
        if (wordsArray == null || wordsArray.length == 0) {
            return "";
        }

        String maxWord = wordsArray[0];
        for (int i = 1; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > maxWord.length()) {
                maxWord = wordsArray[i];
            }
        }
        return maxWord;
    }
}
