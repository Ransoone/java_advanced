package org.example;

import java.util.Scanner;

public class Main {
    /**
     * Метод main, запрашивающий у пользователя выбор действия и запускающий соответствующий метод.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Калькулятор");
        System.out.println("2. Поиск самого длинного слова в массиве");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Calculator calculator = new Calculator();
                calculator.calculate();
                break;
            case 2:
                WordFinder wordFinder = new WordFinder();
                wordFinder.findLongestWord();
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }

    public static class Calculator {

        /**
         * Метод, реализующий калькулятор.
         */
        public static void calculate() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Выберите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = calculateNumbers(num1, num2, operation);

            System.out.println("Результат: " + result);

            scanner.close();
        }

        /**
         * Метод, реализующий вычисление над двумя числами.
         *
         * @param num1      Первое число.
         * @param num2      Второе число.
         * @param operation Выбранная операция (+, -, *, /).
         * @return Результат операции.
         */
        public static double calculateNumbers(double num1, double num2, char operation) {
            switch (operation) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        System.out.println("Деление на ноль невозможно!");
                        return Double.NaN;
                    }
                default:
                    System.out.println("Неверная операция!");
                    return Double.NaN;
            }
        }
    }

    public static class WordFinder {
        /**
         * Метод, запрашивающий у пользователя длину массива и его элементы, находящий самое длинное слово в массиве.
         */
        public static void findLongestWord() {
            Scanner scanner = new Scanner(System.in);

            // Запрос пользователю ввести длину массива
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();

            // Создание массива строк
            String[] words = new String[length];

            // Запрос пользователю ввести элементы массива
            for (int i = 0; i < length; i++) {
                System.out.print("Введите элемент массива " + (i + 1) + ": ");
                words[i] = scanner.next();
            }

            // Поиск самого длинного слова в массиве
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            // Вывод самого длинного слова
            System.out.println("Самое длинное слово: " + longestWord);

            scanner.close();
        }

    }
}