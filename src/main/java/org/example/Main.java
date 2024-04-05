package org.example;

import java.util.Arrays;
import java.util.Random;
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
        System.out.println("3. Максимальный отрицательный и минимальный положительный элементы массива");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Calculator calculator = new Calculator();
                System.out.print("Введите первое число: ");
                double num1 = scanner.nextDouble();
                calculator.setNum1(num1);

                System.out.print("Введите второе число: ");
                double num2 = scanner.nextDouble();
                calculator.setNum2(num2);

                System.out.print("Выберите операцию (+, -, *, /): ");
                char operation = scanner.next().charAt(0);
                calculator.setOperation(operation);

                try {
                    double result = calculator.getResult();
                    System.out.println("Результат: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                break;
            case 2:
                WordFinder wordFinder = new WordFinder();
                wordFinder.findLongestWord();
                break;
            case 3:
                ArrayManipulator arrayManipulator = new ArrayManipulator();
                arrayManipulator.manipulateArray();
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
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
        public static class ArrayManipulator {
            public static void manipulateArray() {
                // Ваш код для манипулирования массивом
                // Например, можно вставить код из предыдущего примера с некоторыми изменениями
            }
        }
    }
    public static class ArrayManipulator {
        public static void manipulateArray() {
            // Создаем массив размерностью 20
            int[] array = new int[20];

            // Заполняем массив случайными целыми числами от -10 до 10
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(21) - 10; // Генерация чисел от -10 до 10
            }
            System.out.println("Исходный массив: " + Arrays.toString(array));
            // Находим максимальный отрицательный и минимальный положительный элементы массива
            int maxNegative = Integer.MIN_VALUE;
            int minPositive = Integer.MAX_VALUE;
            for (int num : array) {
                if (num < 0 && num > maxNegative) {
                    maxNegative = num;
                } else if (num > 0 && num < minPositive) {
                    minPositive = num;
                }
            }

            // Поменяем местами максимальный отрицательный и минимальный положительный элементы массива
            for (int i = 0; i < array.length; i++) {
                if (array[i] == maxNegative) {
                    array[i] = minPositive;
                } else if (array[i] == minPositive) {
                    array[i] = maxNegative;
                }
            }

            // Выводим исходный и измененный массивы
            System.out.println("Измененный массив: " + Arrays.toString(array));
        }
    }
}